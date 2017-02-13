package dayOne;

/**
 * Created by student on 13/02/2017.
 */
public class Example {

    public static void main(String[] args) {
        whileLoop();
    }

    static void whileLoop() {
        System.out.println("Starting to count...");

        int counter = 0;
        while (counter <= 100) {
            System.out.println(counter);

            counter++;
        }
        System.out.println("Finished counting...");
    }
}
