package Small;

import Content.Title;

public class SmallTitle implements Title {

    private String text;

    public SmallTitle(String text) {
        this.text = text;
    }

    @Override
    public String getTitle() {
        return text;
    }
}
