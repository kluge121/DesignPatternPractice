package Factory;

import Content.Document;
import ContentIngredientFactory.DocumentIngredientFactory;
import ContentIngredientFactory.SmallDocumentIngredientFactory;
import Small.SmallDocument;

import java.util.ArrayList;

public class SmallFactory extends DocumentFactory {

    @Override
    public Document createDocument(String title, ArrayList<String> arrHead, ArrayList<String> arrText) {

        Document document = null;
        DocumentIngredientFactory documentIngredientFactory = new SmallDocumentIngredientFactory();
        document = new SmallDocument(documentIngredientFactory);

        document.createTitle(title);
        document.createHead(arrHead);
        document.createText(arrText);

        return document;
    }


}
