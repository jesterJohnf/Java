package dayOne;

/**
 * Created by student on 13/02/2017.
 */
public class ArrayExample {
    public static void main(String[] args) {

        String[] data = {"This", "is", "a", "String"};

        // while
        int counter = 0;
        while (counter < data.length) {

            System.out.println(data[counter]);

            counter++;
        }

        // do while
        int doCount = 0;
        do {
            System.out.println(data[doCount]);

            doCount++;

        } while(doCount < data.length);

        // for
        for(int i = 0; i < data.length; i++)
            System.out.println(data[i]);

        //foreach
        for(String s : data)
            System.out.println(s);
    }
}
