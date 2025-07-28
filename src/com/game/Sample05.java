package com.game;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// メインクラス
public class Sample05 {

    public static void main(String[] args) {
        // ウインドウを生成する
        new GameWindow("サンプルゲーム", 1280, 720);
    }
}

// ウインドウ描画クラス
class GameWindow extends JFrame { // staticキーワードを削除

    // 各GUI部品を定義する
    Canvas canvas; // staticキーワードを削除

    // 各ラベルを定義する
    Label labelA; // staticキーワードを削除
    Label labelB; // staticキーワードを削除

    // 自分と敵のカードを表示するラベルを定義する
    Label playerLabel; // staticキーワードを削除
    Label enemyLabel; // staticキーワードを削除

    // High&Lowボタンを定義する
    Button highButton; // staticキーワードを削除
    Button lowButton; // staticキーワードを削除

    // システムボタンを定義する
    Button resumeButton; // staticキーワードを削除
    Button exitButton; // staticキーワードを削除

    // カードクラス
    Card card; // staticキーワードを削除

    // 自分と敵のカード番号
    int player; // staticキーワードを削除
    int enemy; // staticキーワードを削除

    public GameWindow(String title, int width, int height) {
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
        canvas = new Canvas();
        // 描画領域をウインドウに追加する（initより前に移動）
        add(canvas);

        // ラベルやボタンなどの初期化処理を行う
        init();

        // ウインドウを表示する
        setVisible(true);
    }

    public void init() {
        // 各High&Lowボタンを生成する
        highButton = new Button("HIGH", 90, 500);
        lowButton = new Button("LOW", 890, 500);

        // 各システムボタンを生成する
        resumeButton = new Button("もう一度！", 90, 500);
        exitButton = new Button("終了する", 890, 500);

        // High&Lowボタンが押されたときの動作を定義する
        // Highを選んだ場合は「true」、Lowの場合は「false」とする
        highButton.addActionListener(_ -> judge(true));
        lowButton.addActionListener(_ -> judge(false));

        // システムボタンが押されたときの動作を定義する
        resumeButton.addActionListener(_ -> resume());
        exitButton.addActionListener(_ -> exit());

        // 各High&Lowボタンを描画領域に追加する
        canvas.add(highButton);
        canvas.add(lowButton);

        // 各システムボタンを描画領域に追加する
        canvas.add(resumeButton);
        canvas.add(exitButton);

        // 各ラベルを生成する
        labelA = new Label("", 0, 50, 1280, 100);
        labelB = new Label("", 0, 150, 1280, 100);
        playerLabel = new Label("", 90, 300, 300, 100);
        enemyLabel = new Label("", 890, 300, 300, 100);

        // 各ラベルを描画領域に追加する
        canvas.add(labelA);
        canvas.add(labelB);
        canvas.add(playerLabel);
        canvas.add(enemyLabel);

        // プレイヤーと敵それぞれのカードを表示する
        playerLabel.setVisible(true);
        enemyLabel.setVisible(true);

        // カードオブジェクトを生成する
        card = new Card();

        // ゲームを初期状態にする
        reset();
    }

    public void reset() {
        // 各ラベルを設定する
        labelA.setText("High&Lowゲーム！");
        labelB.setText("「High」か「Low」か選んでください");

        // 各High&Lowボタンを表示する
        highButton.setVisible(true);
        lowButton.setVisible(true);

        // システムボタンは表示しない
        resumeButton.setVisible(false);
        exitButton.setVisible(false);

        // カードを1枚ずつ配る
        player = card.getCard();
        enemy = card.getCard();

        // プレイヤーと敵それぞれのカードのマークと番号を表示する
        // ただし、敵のカード情報はまだ伏せておく
        playerLabel.setText(card.getInfo(player));
        enemyLabel.setText("？？？");
    }

    public void done() {
        // 各ラベルを設定する
        labelB.setText("もう一度プレイしますか？");

        // システムボタンを表示する
        resumeButton.setVisible(true);
        exitButton.setVisible(true);

        // 各High&Lowボタンは表示しない
        highButton.setVisible(false);
        lowButton.setVisible(false);
    }

    public void judge(boolean choice) { // 変数名をchoiseからchoiceに修正
        // それぞれのカードの番号を取得する
        int playerNum = card.getNum(player);
        int enemyNum = card.getNum(enemy);

        // 敵カードのマークと番号を表示する
        enemyLabel.setText(card.getInfo(enemy));

        // 勝利判定を行う
        if (playerNum == enemyNum) {
            labelA.setText("ドローです！");
        } else if ((playerNum > enemyNum && choice) || (playerNum < enemyNum && !choice)) { // 論理演算子を修正
            // 自分が相手より大きい場合は「High」、
            // 逆の場合は「Low」を選んでいれば勝ち
            labelA.setText("あなたの勝ちです！");
        } else {
            labelA.setText("あなたの負けです！");
        }

        // High&Low終了処理を行う
        done();
    }

    public void resume() {
        // 初期状態に戻してHigh&Lowをやり直す
        reset();
    }

    public void exit() {
        // アプリケーション終了イベントを送出する
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
}

class Card { // staticキーワードを削除
    // カード総数
    private final int numCards = 52;

    // カードリスト
    // 内部では0～51の番号で管理し、
    // スペード「0～12」、ハート「13～25」、ダイヤ「26～38」、クラブ「39～51」となる
    private final List<Integer> cardList; // ジェネリクスを追加

    // カードインデックス
    // 1枚取るごとに加算し、51になったら0に戻す
    private int cardIndex; // staticキーワードを削除

    public Card() {
        // カードリストを生成する
        cardList = new ArrayList<>();

        // ひとつずつカードを追加する
        for (int i = 0; i < numCards; i++) {
            cardList.add(i);
        }
        // コンストラクタで初期化とシャッフルを行う
        reset();
    }

    public int getCard() {
        // カードを山札から1枚取り、インデックスを加算する
        int card = cardList.get(cardIndex++);
        // すべてのカードを取ったらリセットする
        if (cardIndex >= numCards) {
            reset();
        }
        return card;
    }

    // カードのマークを取得する
    public String getMark(int card) {
        // カード番号を13で割ると、その答えは0～3のいずれかになる
        // それぞれの番号をカードのマークに振り分ける
        return switch (card / 13) {
            case 0 -> "スペード";
            case 1 -> "ハート";
            case 2 -> "ダイヤ";
            case 3 -> "クラブ";
            default -> "エラー";
        };
    }

    // カードの番号を取得する
    public int getNum(int card) {
        // カード番号を13で割った余りがカード番号になるが、
        // 内部では「0」から始まっているため、1足しておく必要がある
        return (card % 13) + 1;
    }

    // カード情報を文字列形式で取得する
    public String getInfo(int card) {
        // カード情報は「マーク」+「番号」の形式で表示する
        return getMark(card) + getNum(card);
    }

    private void reset() { // staticキーワードを削除
        // カードインデックスを初期化する
        cardIndex = 0;

        // 山札をシャッフルする
        Collections.shuffle(cardList);
    }
}

// 描画領域を作成するクラス
class Canvas extends JPanel { // staticキーワードを削除

    Canvas() {
        // カンバスを「自由レイアウト」に変更する
        setLayout(null);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        // 親クラスのpaintComponentメソッドを呼び出す
        super.paintComponent(graphics);
    }
}

// ラベルを表示するクラス
class Label extends JLabel { // staticキーワードを削除

    public Label(String string, int posX, int posY, int width, int height) {
        // ラベルのテキストを設定する
        super(string);

        // テキストのフォントを変更する
        setFont(new Font("メイリオ", Font.BOLD, 50));

        // ラベルの位置とサイズを設定する
        setBounds(posX, posY, width, height);

        // テキストを中央揃えにする
        setHorizontalAlignment(Label.CENTER);
    }
}

// ボタンを表示するクラス
class Button extends JButton { // staticキーワードを削除

    public Button(String string, int posX, int posY) {
        // ボタンのテキストを設定する
        super(string);

        // ボタンテキストのフォントを変更する
        setFont(new Font("メイリオ", Font.PLAIN, 50));

        // ボタンの位置とサイズを設定する
        setBounds(posX, posY, 300, 100);
    }
}