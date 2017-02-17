package computerShop.models;

/**
 * Created by student on 17/02/2017.
 */
public class Desktop extends Computer {

    //fields
    public String wifiType;
    public String graphicsCard;

    public String getWifiType() {
        return wifiType;
    }

    public void setWifiType(String wifiType) {
        this.wifiType = wifiType;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Desktop() {}

    //toString
    @Override
    public String toString() {
        return "Desktop{" +
                "wifiType='" + wifiType + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    //constructor
    public Desktop(String name, String description, double price, String brand, String cpu, String ram, String hddSize, String hddType, String series, String wifiType, String graphicsCard) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.hddSize = hddSize;
        this.hddType = hddType;
        this.wifiType = wifiType;
        this.graphicsCard = graphicsCard;
    }
}
