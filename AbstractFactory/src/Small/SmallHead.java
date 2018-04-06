package Small;

import Content.Head;

public class SmallHead implements Head {
    private String text;

    public SmallHead(String text) {
        this.text = text;
    }

    @Override
    public String getHead(int index) {
        return text;
    }
}
