package com.game;

import java.util.ArrayList;
import java.util.List;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//メインクラス
public class Sample06 {

    public static void main(String[] args) {
        // ウインドウを生成する
        new GameWindow2("サンプルゲーム", 1280, 720);
    }

}

//ウインドウ描画クラス
class GameWindow2 extends JFrame {

    // 各GUI部品を定義する
    Canvas2 canvas2;

    public GameWindow2(String title, int width, int height) {
        // ウインドウ名を設定する
        super(title);

        // ウインドウのサイズを設定する
        setSize(width, height);

        // ウインドウサイズの変更を禁止する
        setResizable(false);

        // ウインドウを画面中央に表示する
        setLocationRelativeTo(null);

        // ウインドウを閉じる動作を設定する（「×」ボタンで終了）
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // カンバスを生成する
        canvas2 = new Canvas2(width, height);

        // 描画領域をウインドウに追加する
        add(canvas2);

        // ウインドウを表示する
        setVisible(true);

        // プレイヤーオブジェクトを生成し、BaseObjectのリストに追加する
        Player player = new Player(); // Playerオブジェクトを明示的に生成
        BaseObject.addPlayer(player); // PlayerをBaseObjectのリストに追加する専用メソッド

        // KeyListenerをプレイヤーオブジェクトにセットする
        addKeyListener(player); // 生成したplayerオブジェクトをKeyListenerとして追加
    }

}

//描画領域を作成するクラス
class Canvas2 extends JPanel implements Runnable {

    // スレッドオブジェクト
    Thread thread;

    // メッセージ（ラベル）オブジェクト
    Message message;

    // ウインドウサイズ
    int width;
    int height;

    Canvas2(int width, int height) {
        // ウインドウサイズを保存する
        this.width = width;
        this.height = height;

        // カンバスを「自由レイアウト」に変更する
        setLayout(null);

        // 背景色を黒に設定する
        setBackground(Color.BLACK);

        // メッセージ（ラベル）オブジェクトを生成する
        message = new Message();

        // メッセージをパネルに追加する
        add(message);

        // スレッドオブジェクトを生成する
        thread = new Thread(this);

        // スレッドを開始する
        thread.start();
    }

    // スレッドで実行されるメソッド
    // Runnableインターフェースのメソッドを実装する
    public void run() {
        // 無限ループでThreadを実行し続ける
        while (true) {
            // Thread.sleepは「検査例外」なのでtry-catch文が必須
            try {
                // ゲームで一般的な60fps（毎秒60フレーム描画）を
                // 実現するために、16ミリ秒ほど処理を止めて待機する
                // ただし厳密な60fpsを実現するためには、タイマーなどによる処理が必要
                Thread.sleep(1000 / 60); // 60fpsに修正 (1000 / 16 は約62.5fpsなので、1000/60の方がより一般的です)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // オブジェクト処理を行う
            BaseObject.processAll();

            // パネルを再描画する
            repaint();
        }
    }

    public void paintComponent(Graphics graphics) {
        // パネルを背景色で塗りつぶす
        // これを行わないと前フレームの描画内容が残ってしまう
        graphics.setColor(getBackground());
        graphics.fillRect(0, 0, width, height);

        // すべてのキャラクターオブジェクトを描画する
        BaseObject.drawAll(graphics);

        // ラベルにプレイヤーの座標を表示する
        message.setText("X=" + BaseObject.getPlayerPosX() +
                ", Y=" + BaseObject.getPlayerPosY());
    }

}

// メッセージを表示するクラス
class Message extends JLabel {

    public Message() {
        // テキストのフォントを変更する
        // setFontメソッドの引数はFontオブジェクトであり、
        // インスタンス生成時にフォント名・スタイル・サイズを指定する。
        // なお、スタイルは普通が「Font.PLAIN」で太字が「Font.BOLD」となる。
        setFont(new Font("メイリオ", Font.BOLD, 50));

        // テキスト色を「白」に設定する
        setForeground(Color.WHITE);

        // ラベルの位置とサイズを設定する
        // setBoundsメソッドの引数は
        // 始点X座標・始点Y座標・横サイズ・縦サイズ
        setBounds(0, 550, 1280, 100);

        // テキストを中央揃えにする
        setHorizontalAlignment(JLabel.CENTER);
    }

}

abstract class BaseObject {

    // オブジェクトリスト
    private static List<BaseObject> objects = new ArrayList<>(); // ジェネリクスを使用

    // プレイヤーオブジェクト
    private static Player player;

    // オブジェクト座標
    protected int posX;
    protected int posY;

    // 移動スピード
    protected int speed;

    // オブジェクトを生成し、リストに追加する（汎用）
    public static BaseObject add(String type) {
        BaseObject object = create(type);
        if (object != null) {
            objects.add(object);
        }
        return object;
    }

    // プレイヤーオブジェクトを直接リストに追加するメソッド
    public static void addPlayer(Player p) {
        player = p; // playerフィールドに設定
        objects.add(p); // objectsリストに追加
    }

    // 指定されたオブジェクトの種類に応じて、適切なオブジェクトを生成する
    private static BaseObject create(String type) {
        switch (type) {
            case "Player":
                // ここではPlayerのインスタンスを生成しない（GameWindow2で生成するため）
                // ただし、もし他のオブジェクトタイプをここで生成するなら、そのロジックをここに書く
                return null; // PlayerはGameWindow2で直接生成されるため、ここではnullを返す
            default:
                return null;
        }
    }

    // すべてのオブジェクトを順番に処理する
    public static void processAll() {
        for (BaseObject object : objects) {
            object.process();
        }
    }

    // すべてのオブジェクトを順番に描画する
    public static void drawAll(Graphics graphics) {
        for (BaseObject object : objects) {
            object.draw(graphics);
        }
    }

    public static int getPlayerPosX() {
        // playerがnullでないことを確認
        if (player != null) {
            return player.posX;
        }
        return 0; // または適切なデフォルト値を返す
    }

    public static int getPlayerPosY() {
        // playerがnullでないことを確認
        if (player != null) {
            return player.posY;
        }
        return 0; // または適切なデフォルト値を返す
    }

    // オブジェクトを処理する
    // 抽象メソッドのため、子クラスで実装する必要あり
    abstract void process();

    // オブジェクトを描画する
    // 抽象メソッドのため、子クラスで実装する必要あり
    abstract void draw(Graphics graphics);

}

class Player extends BaseObject implements KeyListener {

    // キー入力状態を保持するための配列
    // 入力中が「true」・押していない状態が「false」となる
    boolean[] keys = new boolean[256];

    Player() {
        // 各要素を初期化する
        posX = 100;
        posY = 100;
        speed = 10;
    }

    // キーイベントを実行
    // 「KeyListenerインターフェース」のメソッドを実装する
    // Keyが押された場合
    public void keyPressed(KeyEvent e) {
        // キー入力状態を「true」にする
        // キーイベントは1秒間に数回しか発生しないため、
        // keyPressedメソッド内でキャラ移動処理を行うと、
        // キャラの移動がカクカクする感じになってしまう。
        // このように変数に入力状態を保持しておくと、キャラ移動が滑らかになる！
        if (e.getKeyCode() >= 0 && e.getKeyCode() < keys.length) { // 配列の範囲チェックを追加
            keys[e.getKeyCode()] = true;
        }
    }

    // Keyが離された場合
    public void keyReleased(KeyEvent e) {
        // キー入力状態を「false」に戻す
        if (e.getKeyCode() >= 0 && e.getKeyCode() < keys.length) { // 配列の範囲チェックを追加
            keys[e.getKeyCode()] = false;
        }
    }

    // Keyが入力された場合
    public void keyTyped(KeyEvent e) {
        // 特にないため現時点では空実装
    }

    // キー入力の状態に応じた処理を行う
    void process() {
        // 配列の並びは「仮想キーコード」に関連付けている。
        // たとえば「VK_LEFT」の値は「0x25（10進数で37）」なので、
        // keys[KeyEvent.VK_LEFT]は37番目の要素を参照することになる
        if (keys[KeyEvent.VK_LEFT]) {
            // speedの値だけキャラを移動させる
            // speedの値を大きくすると、キャラの移動量も大きくなります
            posX -= speed;
        }

        if (keys[KeyEvent.VK_RIGHT]) {
            posX += speed;
        }

        if (keys[KeyEvent.VK_UP]) {
            posY -= speed;
        }

        if (keys[KeyEvent.VK_DOWN]) {
            posY += speed;
        }
    }

    void draw(Graphics graphics) {
        // 赤い矩形を描画してプレイヤーを表現する
        graphics.setColor(Color.red);
        graphics.fillRect(posX, posY, 30, 30);
    }

}