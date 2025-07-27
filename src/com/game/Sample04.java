package com.game;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sample04 {

    public static void main(String[] args) {
        // ウインドウを生成する
        new GameWindow("サンプルゲーム", 1280, 720);
    }

    // ウインドウ描画クラス
    static class GameWindow extends JFrame {

        //各GUI部品を定義する
        static Canvas canvas;
        static Label labelA;
        static Label labelB;

        // じゃんけんボタンを定義する
        static Button rockButton;
        static Button scissorsButton;
        static Button paperButton;

        // システムボタンを定義する
        static Button resumeButton;
        static Button exitButton;

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

            // ラベルやボタンなどの初期化処理を行う
            init();

            // 描画領域をウインドウに追加する
            add(canvas);

            // 各ラベルを描画領域に追加する
            canvas.add(labelA);
            canvas.add(labelB);

            // ウインドウを表示する
            setVisible(true);
        }

        public void init() {
            // 各じゃんけんボタンを生成する
            rockButton = new Button("グー", 90, 500);
            scissorsButton = new Button("チョキ", 490, 500);
            paperButton = new Button("パー", 890, 500);

            // 各システムボタンを生成する
            resumeButton = new Button("もう一度！", 200, 400);
            exitButton = new Button("終了する", 790, 400);

            // じゃんけんボタンが押されたときの動作を定義する
            rockButton.addActionListener(e -> judge(Hand.Rock));
            scissorsButton.addActionListener(e -> judge(Hand.Scissors));
            paperButton.addActionListener(e -> judge(Hand.Paper));

            // システムボタンが押されたときの動作を定義する
            resumeButton.addActionListener(e -> resume());
            exitButton.addActionListener(e -> exit());

            // 各じゃんけんボタンを描画領域に追加する
            canvas.add(rockButton);
            canvas.add(scissorsButton);
            canvas.add(paperButton);

            // 各システムボタンを描画領域に追加する
            canvas.add(resumeButton);
            canvas.add(exitButton);

            // 各ラベルを生成する
            labelA = new Label("", 0, 50);
            labelB = new Label("", 0, 200);

            // ゲームを初期状態にする
            reset();
        }

        public void reset() {
            // 各ラベルを設定する
            labelA.setText("じゃんけんゲーム");
            labelB.setText("手を選んでください");

            // 各じゃんけんボタンを表示する
            rockButton.setVisible(true);
            scissorsButton.setVisible(true);
            paperButton.setVisible(true);

            // システムボタンは表示しない
            resumeButton.setVisible(false);
            exitButton.setVisible(false);
        }

        public void done() {
            // 各ラベルを設定する
            labelB.setText("もう一度プレイしますか？");

            // システムボタンを表示する
            resumeButton.setVisible(true);
            exitButton.setVisible(true);

            // 各じゃんけんボタンは表示しない
            rockButton.setVisible(false);
            scissorsButton.setVisible(false);
            paperButton.setVisible(false);
        }

        public void judge(Hand hand) {
            // 相手がどの手を出すかランダムで決める
            Hand enemy = Hand.getHand();

            // 相手の手を表示するメッセージを作成する
            String message = STR."相手は\{enemy.getName()}を出しました…";

            // 勝ち負けの判定を行う
            switch (Hand.getDeterminant(hand, enemy)) {
                case 0:
                    // あいこの場合はじゃんけんをやり直すため、すぐメソッドを終了する
                    labelA.setText(STR."\{message}あいこでしょ！");
                    return;
                case 1:
                    labelA.setText(STR."\{message}あなたの負けです！");
                    break;
                case 2:
                    labelA.setText(STR."\{message}あなたの勝ちです！");
                    break;
            }

            // 勝ち負けが決まった場合はじゃんけん終了処理を行う
            done();
        }

        public void resume() {
            // 初期状態に戻してじゃんけんをやり直す
            reset();
        }

        public void exit() {
            // アプリケーション終了イベントを送出する
            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }

    //じゃんけんの手に関するクラス
    enum Hand {

        // 3つの手を列挙する
        Rock(0, "グー"), Scissors(1, "チョキ"), Paper(2, "パー");

        // 詳細データ
        private final int num; // 手の番号
        private final String name; // 手の名前

        // 乱数オブジェクト
        static Random rand = new Random();

        Hand(int num, String name) {
            this.name = name;
            this.num = num;
        }

        // ランダムな手を生成する
        public static Hand getHand() {
            return Hand.values()[rand.nextInt(3)];
        }

        // 判定用の数値を算出する
        public static int getDeterminant(Hand player, Hand enemy) {
            // グーを「0」・チョキを「1」・パーを「2」として、
            // 「自分の手 - 相手の手」に3を足して3で割った余りを求めると、
            // 「0」があいこ・「1」が負け・「2」が勝ちになる！
            return (player.getNum() - enemy.getNum() + 3) % 3;
        }

        // 手の番号を取得する
        public int getNum() {
            return num;
        }

        // 手の名前を取得する
        public String getName() {
            return name;
        }

    }

    // 描画領域を作成するクラス
    static class Canvas extends JPanel {

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
    static class Label extends JLabel {

        public Label(String string, int posX, int posY) {
            // ラベルのテキストを設定する
            super(string);

            // テキストのフォントを変更する
            setFont(new Font("メイリオ", Font.BOLD, 50));

            // ラベルの位置とサイズを設定する
            setBounds(posX, posY, 1280, 100);

            // テキストを中央揃えにする
            setHorizontalAlignment(Label.CENTER);
        }

    }

    // ボタンを表示するクラス
    static class Button extends JButton {

        public Button(String string, int posX, int posY) {
            // ボタンのテキストを設定する
            super(string);

            // ボタンテキストのフォントを変更する
            setFont(new Font("メイリオ", Font.PLAIN, 50));

            // ボタンの位置とサイズを設定する
            setBounds(posX, posY, 300, 100);
        }
    }
}
