package Big;

import Content.Text;

public class BigText implements Text {


    private String text;

    public BigText(String text) {
        this.text = text;
    }

    @Override
    public String getText(int index) {
        return text;
    }
}
