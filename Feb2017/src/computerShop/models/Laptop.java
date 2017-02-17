package computerShop.models;

/**
 * Created by student on 17/02/2017.
 */
public class Laptop  extends Computer {

    //fields
    private String series;
    private String battery;
    private double screenSize;
    private String os;

    //getters and setters
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Laptop() {}

    //toString
    @Override
    public String toString() {
        return "Laptop{" + super.toString() +
                "series='" + series + '\'' +
                ", battery='" + battery + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }

    //constructor
    public Laptop(String name, String description, double price, String brand, String cpu, String ram, String hddSize, String hddType, String series, String battery, double screenSize, String os) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.hddSize = hddSize;
        this.hddType = hddType;
        this.series = series;
        this.battery = battery;
        this.screenSize = screenSize;
        this.os= os;



    }


}
