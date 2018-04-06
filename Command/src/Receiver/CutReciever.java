package Receiver;

import Document.Document;

public class CutReciever {

    public String action(Document document, int startIndex, int endIndex) {

        String cutContent = document.getSource().substring(startIndex, startIndex + endIndex);

        StringBuilder sb = new StringBuilder();
        sb.append(document.getSource().substring(0, startIndex));
        sb.append(document.getSource().substring(startIndex + endIndex));
        document.setSource(sb.toString());

        System.out.println("\n-->" + document.getSource() + "<---\n");

        return cutContent;
    }

    public void undo(Document document, String cutContent, int startIndex) {


        StringBuilder sb = new StringBuilder();

        sb.append(document.getSource().substring(0, startIndex));
        sb.append(cutContent);
        sb.append(document.getSource().substring(startIndex));
        document.setSource(sb.toString());

        System.out.println("\n-->" + document.getSource() + "<---\n");

    }
}
