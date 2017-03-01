/**
 * Created by vajni on 2017.03.01..
 */
public class Card {

    private String name;
    private byte breastSize;
    private byte usableHoles;
    private byte partnerCapacity;
    private double price;

    public Card(String name, byte breastSize, byte usableHoles, byte partnerCapacity, double price) {
        this.name = name;
        this.breastSize = breastSize;
        this.usableHoles = usableHoles;
        this.partnerCapacity = partnerCapacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public byte getBreastSize() {
        return breastSize;
    }

    public byte getUsableHoles() {
        return usableHoles;
    }

    public byte getPartnerCapacity() {
        return partnerCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Name =" + name +
                " Breast size=" + breastSize +
                " Usable holes=" + usableHoles +
                " Partner capacity=" + partnerCapacity +
                " Price=" + price +
                '}';
    }
}



