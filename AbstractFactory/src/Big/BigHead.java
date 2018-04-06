package Big;

import Content.Head;

public class BigHead implements Head {


    private String text;

    public BigHead(String text) {
        this.text = text.toUpperCase();
    }

    @Override
    public String getHead(int index) {
        return "Section " + index + ". --- " + text + " ---";
    }
}
