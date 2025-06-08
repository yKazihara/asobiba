package com.sample.exception;

public class Person2 {
    private String name;

    public Person2(String name) {
        setName(name);
    }

    public Person2() {
        this(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            // 引数がnullの場合は、デフォルト値をセットします。
            // ここでは、デフォルト値を「長さ0の文字列」とします。
            this.name = "";
        } else {
            // 引数がnullではなく文字列の場合は、
            // それをセットします。
            this.name = name;
        }
    }
}
