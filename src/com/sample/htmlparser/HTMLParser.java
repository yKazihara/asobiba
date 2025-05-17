package com.sample.htmlparser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLParser {
    /**
     * タグの正規表現
     */
    private static final Pattern tagPattern = Pattern
            .compile("(<([^ >]+)([^>]*)>)([^<]*)");

    private final Matcher matcher;

    private Tag tag;

    /**
     * コンストラクタです。
     *
     * @param src HTMLソース
     */
    public HTMLParser(String src) {
        matcher = tagPattern.matcher(src);
    }

    /**
     * 次のHTMLタグがあるかどうかを検査します。
     *
     * @return 存在する場合はtrue
     */
    public boolean hasNext() {
        boolean found = matcher.find();
        if (found) {
            tag = new Tag(matcher.group(1), matcher.group(2), matcher.group(3),
                    matcher.group(4));
        }
        return found;
    }

    /**
     * 次のHTMLタグを返します。
     *
     * @return タグをあらわすオブジェクト
     */
    public Tag next() {
        return tag;
    }

    public static void main(String[] args) {

        // サンプルのHTMLを用意します。
        String sb = "<html>" +
                " <head>" +
                "  <title>JavaMasterのお店</title>" +
                " </head>" +
                " <body>" +
                "  <h1>JavaMasterへようこそ！</h1>" +
                "  <p>おいしいコーヒーの通信販売を行っています。" +
                "  <!-- 会員用入り口 -->" +
                "  <a href='login.jsp'>ログイン</a>" +
                " </body>" +
                "</html>";

        // パーサオブジェクトを作成します。
        HTMLParser parser = new HTMLParser(sb);

        // タグを順番に処理します。
        while (parser.hasNext()) {
            Tag tag = parser.next();
            System.out.println(tag);
        }
        //タグ:[html], 属性:[], テキスト: [ ]
        //タグ:[head], 属性:[], テキスト: [  ]
        //タグ:[title], 属性:[], テキスト: [JavaMasterのお店]
        //タグ:[/title], 属性:[], テキスト: [ ]
        //タグ:[/head], 属性:[], テキスト: [ ]
        //タグ:[body], 属性:[], テキスト: [  ]
        //タグ:[h1], 属性:[], テキスト: [JavaMasterへようこそ！]
        //タグ:[/h1], 属性:[], テキスト: [  ]
        //タグ:[p], 属性:[], テキスト: [おいしいコーヒーの通信販売を行っています。  ]
        //タグ:[!--], 属性:[ 会員用入り口 --], テキスト: [  ]
        //タグ:[a], 属性:[ href='login.jsp'], テキスト: [ログイン]
        //タグ:[/a], 属性:[], テキスト: [ ]
        //タグ:[/body], 属性:[], テキスト: []
        //タグ:[/html], 属性:[], テキスト: []
    }
}
