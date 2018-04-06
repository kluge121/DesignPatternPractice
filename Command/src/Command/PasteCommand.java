package Command;

import Receiver.PasteReceiver;
import Document.Document;

import java.util.Scanner;

public class PasteCommand implements ICommand {

    private PasteReceiver receiver;
    private int startIndex;
    private Document document;
    private String pasteContent;


    public PasteCommand(Document document, PasteReceiver receiver) {
        this.receiver = receiver;
        this.document = document;
    }

    @Override
    public void excute() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify index where the paste must start:");
        startIndex = sc.nextInt();
        pasteContent = sc.nextLine();
        System.out.println("You choose start index : " + startIndex);
        System.out.println("Please specify text to be inserted:");
        pasteContent = sc.nextLine();


        receiver.action(document, pasteContent, startIndex);
    }

    @Override
    public void undo() {
        receiver.undo(document, pasteContent.length(), startIndex);

    }
}
