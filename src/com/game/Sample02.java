package com.game;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sample02 {
    public static void main(String[] args) {
        // ウインドウを生成する
        GameWindow gameWindow = new GameWindow("サンプルゲーム", 1280, 720);

        // 描画領域を追加する
        gameWindow.add(new Canvas());

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
}
