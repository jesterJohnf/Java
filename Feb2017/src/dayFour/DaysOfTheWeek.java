package dayFour;

/**
 * Created by student on 16/02/2017.
 */
public enum DaysOfTheWeek {

    //a list of named constants (Value type NOT reference type)
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int day;

    DaysOfTheWeek(int d) {
        day = d;
    }

    int getDay() {
        return day;
    }
}
