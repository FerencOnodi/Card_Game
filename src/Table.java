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

    public void setNumberOfPlayers(int number){
        this.numberOfPlayers = number;
   
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
        return 0;
    }

    public int compareByAvailableHoles(Player p1, Player p2){
        return 0;
    }

    public int compareByCapacity(Player p1, Player p2) {
        return 0;
    }

    public int compareByPrice(Player p1, Player p2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Table{" +
                "player=" + table +
                '}';
    }
    public void handOutCards(){
    	if (numberOfPlayers == 2){
    		parser.dealer.addCardsToPlayers(table.get(1), table.get(1));
    	}else if( numberOfPlayers == 3){
    		parser.dealer.addCardsToPlayers(table.get(0), table.get(1), table.get(2));
    	}
    	else if( numberOfPlayers == 4){
    		parser.dealer.addCardsToPlayers(table.get(0), table.get(1), table.get(2), table.get(3));
    	}
    }
}
