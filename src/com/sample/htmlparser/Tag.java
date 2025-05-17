package com.sample.htmlparser;

public class Tag {
    private final String tagStr;

    private final String tagName;

    private final String tagAttribute;

    private final String tagText;

    public Tag(String tagStr, String tagName, String tagAttribute,
               String tagText) {
        this.tagStr = tagStr;
        this.tagName = tagName;
        this.tagAttribute = tagAttribute;
        this.tagText = tagText;
    }

    @Override
    public String toString() {
        return STR."タグ:[\{tagName}], 属性:[\{tagAttribute}], テキスト: [\{tagText}]";
    }

}
