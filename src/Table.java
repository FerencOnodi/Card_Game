import java.util.List;

/**
 * Created by vajni on 2017.03.01..
 */
public class Table implements Comparator {

    List<Player> player;
    byte numberOfPlayers;

    public Table(byte numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setNumberOfPlayers(byte number){
        this.numberOfPlayers = number;
    }

    public void addPlayersToTable(){
        //for (int i=0; i<numberOfPlayers; i++)
            //player.add();
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
}
