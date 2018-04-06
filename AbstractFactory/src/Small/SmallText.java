package Small;

import Content.Text;

public class SmallText implements Text {

    private String text;

    public SmallText(String text) {
        this.text = text;
    }


    @Override
    public String getText(int index) {
        return text;
    }
}
