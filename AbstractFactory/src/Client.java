import Big.BigDocument;
import Content.Document;
import Factory.BigFactory;
import Factory.DocumentFactory;
import Factory.SmallFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    private String title;
    private ArrayList<String> arrHead = new ArrayList<>();
    private ArrayList<String> arrText = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    public static void main(String args[]) {

        Client client = new Client();
        client.inputContent();
        client.outputContent();

    }

    private void inputContent() {

        int count = 1;
        System.out.println("Enter title:");
        title = sc.nextLine();
        System.out.println();


        while (true) {

            System.out.println(count + ". Enter Headiong: or -done");
            String head = sc.nextLine().toLowerCase();

            if (head.equals("-done")) {
                break;
            } else {
                arrHead.add(head);
                System.out.println();
                System.out.println(count + ". Enter text:");
                arrText.add(sc.nextLine());
                System.out.println();
            }

            count++;

        }


    }
    private void outputContent() {

        Document document;
        DocumentFactory factory;

        label:
        while (true) {
            System.out.println("Enter the style you want displayed:");
            String type = sc.nextLine().toLowerCase();

            switch (type) {
                case "big":
                    factory = new BigFactory();
                    break label;
                case "small":
                    factory = new SmallFactory();
                    break label;
                default:
                    System.out.println("Please input big or small ");
                    break;
            }

        }
        document = factory.createDocument(title, arrHead, arrText);
        System.out.println("\n\n" + document.toString());

    }

}
