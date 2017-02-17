package computerShop.processor;

import computerShop.gui.CommandInterface;
import computerShop.models.GeneratedLaptop;


/**
 * Created by student on 17/02/2017.
 */
public class ProgrammeMain {
    public static void main(String[] args) {

        // Create temp laptop collection
        GeneratedLaptop.createLaptops();

        CommandInterface.display();


    }
}
