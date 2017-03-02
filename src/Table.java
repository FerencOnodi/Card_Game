import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vajni on 2017.03.01..
 */
public class Table implements Comparator {

    XMLParser parser = new XMLParser();
    List<Player> table = new ArrayList<>();
    int numberOfPlayers;

    public Table(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;

    }

    public void addPlayersToTable(){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<numberOfPlayers; i++) {
            System.out.println(i+1 + ". játékos adja meg a nevét:");
            Player p = new Player(sc.next());
            table.add(p);
        }
    }

    public int compareByBoobSize(Player p1, Player p2) {
        if (p1.getCardsInHands().get(0).getBreastSize() > p2.getCardsInHands().get(0).getBreastSize()){
            return 1;
        }
        else if (p1.getCardsInHands().get(0).getBreastSize() == p2.getCardsInHands().get(0).getBreastSize()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public int compareByAvailableHoles(Card c1, Card c2){
        if (c1.getUsableHoles() > c2.getUsableHoles()){
            return 1;
        }
        else if (c1.getUsableHoles() > c2.getUsableHoles()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public int compareByCapacity(Card c1, Card c2) {
        if (c1.getPartnerCapacity() > c2.getPartnerCapacity()){
            return 1;
        }
        else if (c1.getPartnerCapacity() > c2.getPartnerCapacity()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public int compareByPrice(Card c1, Card c2) {
        if (c1.getPrice() > c2.getPrice()){
            return 1;
        }
        else if (c1.getPrice() > c2.getPrice()){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Table{" +
                "player=" + table +
                '}';
    }
    public void handOutCards(){
    	if (numberOfPlayers == 2){
    		parser.dealer.addCardsToPlayers(table.get(0), table.get(1));
    	}else if( numberOfPlayers == 3){
    		parser.dealer.addCardsToPlayers(table.get(0), table.get(1), table.get(2));
    	}
    	else if( numberOfPlayers == 4){
    		parser.dealer.addCardsToPlayers(table.get(0), table.get(1), table.get(2), table.get(3));
    	}
    }
}
