import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vajni on 2017.03.01..
 */
public class Table implements Comparator {

    XMLParser parser = new XMLParser();
    List<Player> table = new ArrayList<>();
    List<Card> currentCards = new ArrayList<Card>();
    Printer printer = new Printer();
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

    public int compareByBoobSize(Card c1, Card c2) {
        if (c1.getBreastSize() > c2.getBreastSize()){
            return 1;
        }
        else if (c1.getBreastSize() == c2.getBreastSize()){
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
        else if (c1.getUsableHoles() == c2.getUsableHoles()){
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
        else if (c1.getPartnerCapacity() == c2.getPartnerCapacity()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public int compareByPrice(Card c1, Card c2) {
        if (c1.getPrice() < c2.getPrice()){
            return 1;
        }
        else if (c1.getPrice() == c2.getPrice()){
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
    
    
    public int chooseAttribute(){
    	Scanner sc = new Scanner(System.in);
    	printer.print("Pick your option(number)\n1. Breast size\n2. Usable holes\n3. Partner capacity\n4. Price");
    	int n = sc.nextInt();
    	return n;
    }
    
    
	public boolean handChecker(int check){
		for(Player p : table){
			if(p.getCardsInHands().size() == check){
				return true;
			}

		}
		return false;
	}
	
	
	public int comparer(int attribute){
		if(attribute == 1){
			return compareByBoobSize(currentCards.get(0), currentCards.get(1));
		} else if(attribute == 2){
			return compareByAvailableHoles(currentCards.get(0), currentCards.get(1));
		} else if(attribute == 3){
			return compareByCapacity(currentCards.get(0), currentCards.get(1));
		} else {
			return compareByPrice(currentCards.get(0), currentCards.get(1));
		}
	}
    
	
    public void game(){
    	int allCards = parser.dealer.deckList.size()-1;
    	while(handChecker(allCards) != true){
    		for(Player p: table){
    			currentCards.add(p.getCardsInHands().get(0));
    			p.getCardsInHands().remove(0);
    		}
    		int result = comparer(chooseAttribute());
    		while (result == 0){
        		if(result == 1){
        			table.get(0).getCardsInHands().addAll(currentCards);
        		} else if(result == -1){
        			table.get(1).getCardsInHands().addAll(currentCards);
        		} else {
        			printer.print("It is a tie! Choose another attribute to compare.");
        			result = comparer(chooseAttribute());
        			
        		}
    		}

    			
    		
    		
    		
    	}

    }
    
}
