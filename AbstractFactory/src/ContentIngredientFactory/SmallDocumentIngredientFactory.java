package ContentIngredientFactory;

import Content.Title;
import Small.SmallHead;
import Small.SmallText;
import Small.SmallTitle;

import java.util.ArrayList;

public class SmallDocumentIngredientFactory implements DocumentIngredientFactory {


    @Override
    public Title createTitle(String title) {
        return new SmallTitle(title);
    }

    @Override
    public ArrayList createHead(ArrayList<String> arrayList) {

        ArrayList<SmallHead> tmpArr = new ArrayList<SmallHead>();
        for (String anArrayList : arrayList) {
            tmpArr.add(new SmallHead(anArrayList));
        }
        return tmpArr;
    }

    @Override
    public ArrayList creatText(ArrayList<String> arrayList) {
        ArrayList<SmallText> tmpArr = new ArrayList<SmallText>();
        for (String anArrayList : arrayList) {
            tmpArr.add(new SmallText(anArrayList));
        }
        return tmpArr;
    }
}

