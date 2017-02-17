package computerShop.processor;

import computerShop.models.Laptop;

import static computerShop.models.GeneratedLaptop.laptops;

/**
 * Created by student on 17/02/2017.
 */
public class TaskProcessing {
    public static void listAllLaptops() {
        for(Laptop l: laptops) {
            System.out.println(l);
        }
    }

}
