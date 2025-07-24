package com.game;

import javax.swing.JFrame;
public class Sample01 {
    public static void main(String[] args) {
        // ウインドウを生成する
        GameWindow gameWindow = new GameWindow("サンプルゲーム", 1280, 720);

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
}
