package computerShop.models;

import java.util.Date;

/**
 * Created by student on 17/02/2017.
 */
public class Computer {

    //fields

    public int id;
    public String name;
    public String description;
    public double price;
    public String brand;
    public String cpu;
    public String ram;
    public String hddSize;
    public String hddType;

    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHddSize() {
        return hddSize;
    }

    public void setHddSize(String hddSize) {
        this.hddSize = hddSize;
    }

    public String getHddType() {
        return hddType;
    }

    public void setHddType(String hddType) {
        this.hddType = hddType;
    }


    public Computer() {}

    //constructor
    public Computer(int id, String name, String description, double price, String brand, String cpu, String ram, String hddSize, String hddType) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.hddSize = hddSize;
        this.hddType = hddType;
    }

    //toString
    @Override
    public String toString() {
        return "Computer{" +
                "name=" + name +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", brand=" + brand +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", hddSize=" + hddSize +
                ", hddType=" + hddType +

                '}';
    }
}
