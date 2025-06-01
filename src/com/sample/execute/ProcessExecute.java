package com.sample.execute;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessExecute {
    public static void main(String[] args) throws InterruptedException, IOException {
        //List<String> commandForWindows = new ArrayList<>(Arrays.asList("cmd", "/C", "dir", "C:\\Program Files\\Java"));
        List<String> commandForMac = new ArrayList<>(Arrays.asList("ls", "./"));

        ProcessBuilder pb = new ProcessBuilder(commandForMac);
        Process p = pb.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        Catcher c = new Catcher(br);
        c.start();

        // プロセスの終了を待つ
        p.waitFor();

        // Catcher スレッドが読み取りを完了するまで待つ
        try {
            c.join();
        } catch (InterruptedException e) {
            // スレッドの中断状態を復元
            Thread.currentThread().interrupt();
            e.printStackTrace();
        } finally {
            br.close();
        }

        // プロセスを破棄
        p.destroy();

        System.out.println(c.out.toString());
    }
}

class Catcher extends Thread {
    Reader in;
    StringWriter out = new StringWriter();
    public Catcher(Reader in) {
        this.in = in;
    }

    public void run() {
        int c;
        try {
            while ((c = in.read()) != -1) {
                out.write((char)c);
            }
        } catch (IOException e) {
            System.err.println(STR."Error reading from stream: \{e.getMessage()}");
        }
    }
}