package dayFour;

/**
 * Created by student on 16/02/2017.
 */
public class DayTest {
    public static void main(String[] args) {
        DaysOfTheWeek monday = DaysOfTheWeek.MONDAY;

        System.out.println(monday);

        monday = DaysOfTheWeek.FRIDAY;

        System.out.println("The day of the week is " + monday + " and it is the day " + monday.getDay() + " of the week");

        //get all constants object
        DaysOfTheWeek days[] = DaysOfTheWeek.values();

        for (DaysOfTheWeek d : days)
            System.out.println(d);
    }
}
