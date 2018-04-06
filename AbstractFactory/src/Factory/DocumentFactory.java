package Factory;

import Content.Document;
import Content.Head;
import Content.Text;
import Content.Title;

import java.util.ArrayList;

public abstract class DocumentFactory {


    public abstract Document createDocument(String title, ArrayList<String> arrHead, ArrayList<String> arrText);


}
