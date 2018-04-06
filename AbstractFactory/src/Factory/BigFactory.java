package Factory;

import Big.BigDocument;
import Content.Document;
import ContentIngredientFactory.BigDocumentIngredientFactoryFactory;
import ContentIngredientFactory.DocumentIngredientFactory;


import java.util.ArrayList;

public class BigFactory extends DocumentFactory {


    @Override
    public Document createDocument(String title, ArrayList<String> arrHead, ArrayList<String> arrText) {

        Document document = null;
        DocumentIngredientFactory documentIngredientFactory = new BigDocumentIngredientFactoryFactory();
        document = new BigDocument(documentIngredientFactory);

        document.createTitle(title);
        document.createHead(arrHead);
        document.createText(arrText);

        return document;

    }
}
