package Receiver;

import Document.Document;

public class PasteReceiver {

    public void action(Document document, String pasteContent, int startIndex) {


        StringBuilder sb = new StringBuilder();
        String source = document.getSource();


        if (source.length() != 0) {
            sb.append(source.substring(0, startIndex));
            sb.append(pasteContent);
            sb.append(source.substring(startIndex + 1));
        } else {
            sb.append(pasteContent);
        }

        document.setSource(sb.toString());
        System.out.println("\n-->" + document.getSource() + "<---\n");


    }

    public void undo(Document document, int pasteLength, int startIndex) {
        String content = "";
        try {
            content = document.getSource().substring(4, pasteLength + 1);

        } catch (StringIndexOutOfBoundsException e) {
        } finally {
            document.setSource(content);
            System.out.println("\n-->" + document.getSource() + "<---\n");

        }


    }
}
