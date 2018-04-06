package ContentIngredientFactory;

import Content.Title;

import java.util.ArrayList;

public interface DocumentIngredientFactory {



    public Title createTitle(String title);

    public ArrayList createHead(ArrayList<String> arayList);

    public ArrayList creatText(ArrayList<String> arrayList);
}
