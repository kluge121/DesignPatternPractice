package ContentIngredientFactory;

import Big.BigHead;
import Big.BigText;
import Big.BigTitle;
import Content.Title;

import java.util.ArrayList;

public class BigDocumentIngredientFactoryFactory implements DocumentIngredientFactory {

    @Override
    public Title createTitle(String title) {
        return new BigTitle(title);
    }

    @Override
    public ArrayList createHead(ArrayList<String> arrayList) {

        ArrayList<BigHead> tmpArr = new ArrayList<BigHead>();
        for (String anArrayList : arrayList) {
            tmpArr.add(new BigHead(anArrayList));
        }
        return tmpArr;
    }

    @Override
    public ArrayList creatText(ArrayList<String> arrayList) {
        ArrayList<BigText> tmpArr = new ArrayList<BigText>();
        for (String anArrayList : arrayList) {
            tmpArr.add(new BigText(anArrayList));
        }
        return tmpArr;
    }


}
