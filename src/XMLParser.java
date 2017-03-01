import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 * Created by ferenc on 2017.03.01..
 */
public class XMLParser {

    private static final String filePath = "src/Cards.xml";
    private Map<String, Integer[]> cardData;
    private Integer[] values = new Integer[4];


    public void XmlParser() {
        try {
            File inputFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

            doc.getDocumentElement().normalize();
            System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());
            System.out.println("--------------");

            NodeList nList = doc.getElementsByTagName("Card");

            cardData = new HashMap<>();

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node node = nList.item(temp);
                Element element = (Element) node;

                values[0] = Integer.valueOf(element.getElementsByTagName("breastSize").item(0).getTextContent());
                values[1] = Integer.valueOf(element.getElementsByTagName("usableHoles").item(0).getTextContent());
                values[2] = Integer.valueOf(element.getElementsByTagName("partnerCapacity").item(0).getTextContent());
                values[3] = Integer.valueOf(element.getElementsByTagName("price").item(0).getTextContent());

                cardData.put(element.getAttribute("name"), values);


                System.out.println("\nName: " + element.getAttribute("name"));

                System.out.println("Breast size: "
                        + element.getElementsByTagName("breastSize").item(0).getTextContent());
                System.out.println("Usable holes: "
                        + element.getElementsByTagName("usableHoles").item(0).getTextContent());
                System.out.println("Partner capacity: "
                        + element.getElementsByTagName("partnerCapacity").item(0).getTextContent());
                System.out.println("Price: "
                        + element.getElementsByTagName("price").item(0).getTextContent());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Map<String, Integer[]> getCardData() {
        return cardData;
    }
}
