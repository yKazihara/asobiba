package com.game;

import javax.swing.*;
import java.awt.*;

public class Sample03 {

    // ウインドウ部品を定義する
    static GameWindow gameWindow;

    // 各GUI部品を定義する
    static Canvas canvas;
    static Label label;
    static Button button;

    public static void main(String[] args) {
        // ウインドウを生成する
        gameWindow = new GameWindow("サンプルゲーム", 1280, 720);

        // カンバスを生成する
        canvas = new Canvas();

        // カンバスを「自由レイアウト」に変更する
        canvas.setLayout(null);

        // ラベルを生成する
        label = new Label("テストラベル");

        // ボタンを生成する
        button = new Button("テストボタン");

        // ボタンが押されたときの動作を定義する
        // 詳しい動作を定義したメソッドを「ラムダ式」で引き渡す
        button.addActionListener((e) -> button.result(label));

        // 描画領域をウインドウに追加する
        gameWindow.add(canvas);

        // ラベルを描画領域に追加する
        canvas.add(label);

        // ボタンを描画領域に追加する
        canvas.add(button);

        // ウインドウを表示する
        gameWindow.setVisible(true);
    }

    static class GameWindow extends JFrame {

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
        }

    }

    // 描画領域を作成するクラス
    static class Canvas extends JPanel {

        @Override
        public void paintComponent(Graphics graphics) {
            // 親クラスのpaintComponentメソッドを呼び出す
            super.paintComponent(graphics);

            // 2本の線をパネルに描画する
            // drawLineメソッドの引数は
            // 始点X座標・始点Y座標・終点X座標・終点Y座標
            graphics.drawLine(0, 0, 1280, 720);
            graphics.drawLine(0, 720, 1280, 0);

            // 矩形を描画する
            // drawRectメソッドの引数は
            // 始点X座標・始点Y座標・横サイズ・縦サイズ
            graphics.drawRect(440, 310, 100, 100);

            // 矩形を塗りつぶし描画する
            // fillRectメソッドの引数は
            // 始点X座標・始点Y座標・横サイズ・縦サイズ
            graphics.fillRect(740, 310, 100, 100);
        }

    }

    // ラベルを表示するクラス
    static class Label extends JLabel {

        public Label(String string) {
            // ラベルのテキストを設定する
            super(string);

            // テキストのフォントを変更する
            // setFontメソッドの引数はFontオブジェクトであり、
            // インスタンス生成時にフォント名・スタイル・サイズを指定する。
            // なお、スタイルは普通が「Font.PLAIN」で太字が「Font.BOLD」となる。
            setFont(new Font("メイリオ", Font.BOLD, 50));

            // ラベルの位置とサイズを設定する
            // setBoundsメソッドの引数は
            // 始点X座標・始点Y座標・横サイズ・縦サイズ
            setBounds(0, 550, 1280, 100);

            // テキストを中央揃えにする
            setHorizontalAlignment(Label.CENTER);
        }

    }

    // ボタンを表示するクラス
    static class Button extends JButton {

        public Button(String string) {
            // ボタンのテキストを設定する
            super(string);

            // ボタンテキストのフォントを変更する
            // setFontメソッドの引数はFontオブジェクトであり、
            // インスタンス生成時にフォント名・スタイル・サイズを指定する。
            // なお、スタイルは普通が「Font.PLAIN」で太字が「Font.BOLD」となる。
            setFont(new Font("メイリオ", Font.PLAIN, 50));

            // ボタンの位置とサイズを設定する
            // setBoundsメソッドの引数は
            // 始点X座標・始点Y座標・横サイズ・縦サイズ
            setBounds(390, 100, 500, 100);
        }

        public void result(Label label) {
            // ボタンが押されたときは、ラベルのテキストを変更する
            label.setText("ボタンがクリックされました！");
        }
    }
}
