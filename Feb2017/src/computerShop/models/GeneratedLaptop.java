package computerShop.models;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 17/02/2017.
 */
public class GeneratedLaptop {
    // List - sequence of objects stored with index
    public static List<Laptop> laptops = new ArrayList<>();

    public static void createLaptops() {
        Laptop lap1 = new Laptop("VIVOBOOK", "Laptop",599.99, "ASUS", "i7", "12gb", "2tb", "hdd", "X Series","10 hours", 15.6, "Windows 10");

        laptops.add(lap1); // index 0


    }
}
