package com.sample.dialog;

import javax.swing.*;

public class ExceptionDialog {
    public static void main(String[] args) {
        try {
            "hello".charAt(-1);
        } catch (Exception e) {
            // 例外が発生したときにダイアログを表示します。
            JOptionPane.showMessageDialog(null, "処理中にエラーが発生しました");
        }
    }
}
