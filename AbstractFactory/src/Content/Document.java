package Content;

import java.util.ArrayList;

public abstract class Document {

    public Title title;

    public ArrayList<Head> arrHead;

    public ArrayList<Text> arrText;


    public abstract void createTitle(String title);

    public abstract void createHead(ArrayList<String> arrayList);

    public abstract void createText(ArrayList<String> arrayList);


    public String toString() {

        String line = "\n";
        int count = arrHead.size();

        StringBuilder sb = new StringBuilder();
        sb.append(title.getTitle());
        sb.append(line);
        sb.append(line);

        for (int i = 0; i < count; i++) {
            sb.append(arrHead.get(i).getHead(i));
            sb.append(line);
            sb.append(arrText.get(i).getText(i));
            sb.append(line);
            sb.append(line);
        }
        return sb.toString();

    }


}
