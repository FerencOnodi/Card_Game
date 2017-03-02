import java.util.Scanner;

/**
 * Created by ferenc on 2017.03.01..
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        /*Scanner scanner = new Scanner(System.in);
        printer.print("Enter the number of players(2/3/4): ");
        int number = scanner.nextInt();*/
        Table t = new Table(2);
        t.parser.XmlParser();
        t.addPlayersToTable();
        t.handOutCards();
        //printer.printList(t.table.get(0).getCardsInHands());
        //printer.printList(t.table.get(1).getCardsInHands());
        t.game();

    }
}
