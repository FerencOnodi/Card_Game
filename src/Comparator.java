/**
 * Created by vajni on 2017.03.01..
 */
public interface Comparator {

    int compareByBoobSize(Player p1, Player p2);
    int compareByAvailableHoles(Player p1, Player p2);
    int compareByCapacity(Player p1, Player p2);
    int compareByPrice(Player p1, Player p2);
}
