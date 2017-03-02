/**
 * Created by vajni on 2017.03.01..
 */
public class Card {

    private String name;
    private int breastSize;
    private int usableHoles;
    private int partnerCapacity;
    private int price;

    public Card(String name, int breastSize, int usableHoles, int partnerCapacity, int price) {
        this.name = name;
        this.breastSize = breastSize;
        this.usableHoles = usableHoles;
        this.partnerCapacity = partnerCapacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getBreastSize() {
        return breastSize;
    }

    public int getUsableHoles() {
        return usableHoles;
    }

    public int getPartnerCapacity() {
        return partnerCapacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String result =
                "Name = " + name +"\n"+
                "Breast size = " + breastSize +"\n"+
                "Usable holes = " + usableHoles +"\n"+
                "Partner capacity = " + partnerCapacity +"\n"+
                "Price = " + price + "\n";
        return result;
    }
}



