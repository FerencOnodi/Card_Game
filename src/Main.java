/**
 * Created by ferenc on 2017.03.01..
 */
public class Main {
    public static void main(String[] args) {
        Table t = new Table(3);
        t.parser.XmlParser();
        t.addPlayersToTable();
        t.handOutCards();
        System.out.println(t.table.get(0).getCardsInHands());
        System.out.println(t.table.get(1).getCardsInHands());
        System.out.println(t.table.get(2).getCardsInHands());

    }
}
