package Small;

import Content.Document;
import ContentIngredientFactory.DocumentIngredientFactory;

import java.util.ArrayList;

public class SmallDocument extends Document {

    private DocumentIngredientFactory documentIngredientFactory;

    public SmallDocument(DocumentIngredientFactory documentIngredientFactory) {
        this.documentIngredientFactory = documentIngredientFactory;
    }

    @Override
    public void createTitle(String title) {
        this.title = documentIngredientFactory.createTitle(title);

    }

    @Override
    public void createHead(ArrayList<String> arrayList) {

        this.arrHead = documentIngredientFactory.createHead(arrayList);

    }

    @Override
    public void createText(ArrayList<String> arrayList) {
        this.arrText = documentIngredientFactory.creatText(arrayList);

    }
}
