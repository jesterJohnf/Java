package dayFour;

/**
 * Created by student on 16/02/2017.
 */
public class ExceptionClass {
    public static void main(String[] args) {
        try {
            compute(1); //not thrown
            compute(15); //thrown MyException
        } catch (MyException e) {
            System.out.println("We caught: " + e);

        }

    }

    static void compute(int a) throws MyException{
        System.out.println("Compute(" + a + ")");
        if(a > 10)
            throw new MyException(a);
    }
}

class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException: " + detail;
    }
}