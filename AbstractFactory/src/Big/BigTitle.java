package Big;

import Content.Title;

public class BigTitle implements Title {

    private String text;

    public BigTitle(String text) {
        this.text = text.toUpperCase();
    }

    @Override
    public String getTitle() {
        return "      ----- " + "Title: " + text + " -----";
    }
}
