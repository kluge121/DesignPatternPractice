package Command;

import Receiver.CutReciever;
import Document.Document;

import java.util.Scanner;

public class CutCommand implements ICommand {

    private Document document;
    private CutReciever reciever;
    private int startIndex;
    private int endIndex;
    private String cutContent;

    public CutCommand(Document document, CutReciever reciever) {
        this.document = document;
        this.reciever = reciever;
    }

    @Override
    public void excute() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify index where the cut must start:");
        startIndex = sc.nextInt();
        System.out.println("You choose start index : " + startIndex);

        System.out.println("Please specify number of characters to be cut:");
        endIndex = sc.nextInt();
        System.out.println("You choose end index : " + endIndex);

        if (startIndex < 0) {
            startIndex = 0;
        }
        if (endIndex + 1 > document.getSource().length()) {
            endIndex = document.getSource().length() - 1;
        }

        cutContent = reciever.action(document, startIndex, endIndex);
    }

    @Override
    public void undo() {

        reciever.undo(document, cutContent, startIndex);

    }
}
