import java.util.List;

/**
 * Created by ferenc on 2017.03.01..
 */
public class Player {

    private List<Card> cardsInHands;
    private String name;

    public Player(List<Card> cardsInHands, String name) {
        this.cardsInHands = cardsInHands;
        this.name = name;
    }

    public List<Card> getCardsInHands() {
        return cardsInHands;
    }

    public String getName() {
        return name;
    }


}
