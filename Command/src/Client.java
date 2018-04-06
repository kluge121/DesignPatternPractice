import Command.CutCommand;
import Command.ICommand;
import Command.PasteCommand;
import Command.QuitCommand;
import Document.Document;
import Receiver.CutReciever;
import Receiver.PasteReceiver;
import Receiver.QuitReciever;


import java.util.Scanner;
import java.util.Stack;

public class Client {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Document document = new Document();

        Stack<ICommand> stack = new Stack<>();
        CutReciever cutReciever = new CutReciever();
        PasteReceiver pasteReciever = new PasteReceiver();

        while (true) {
            System.out.println("Pick from one of the following");
            System.out.println("undo\npaste\nquit\ncut\n");
            String strCommand = sc.nextLine();

            switch (strCommand.toLowerCase()) {
                case "cut":
                    CutCommand cutCcommand = new CutCommand(document, cutReciever);
                    cutCcommand.excute();
                    stack.push(cutCcommand);
                    break;
                case "paste":
                    PasteCommand pasteCommand = new PasteCommand(document, pasteReciever);
                    pasteCommand.excute();
                    stack.push(pasteCommand);
                    break;
                case "quit":
                    new QuitCommand(new QuitReciever()).excute();
                    break;
                case "undo":
                    if (!stack.isEmpty()) {
                        stack.pop().undo();
                    } else {
                        System.out.println("No command.");
                    }
                    break;
                default:
                    break;
            }

        }

    }
}
