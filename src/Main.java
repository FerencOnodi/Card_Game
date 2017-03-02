import java.util.Scanner;

/**
 * Created by ferenc on 2017.03.01..
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players(2/3/4): ");
        int number = scanner.nextInt();

        Table t = new Table(number);
        t.parser.XmlParser();
        t.addPlayersToTable();
        t.handOutCards();
        System.out.println(t.table.get(0).getCardsInHands());
        System.out.println(t.table.get(1).getCardsInHands());
        //System.out.println(t.table.get(2).getCardsInHands());

    }
}
