package lab9;
// Create a enumeration data structure to store seven day of week & access them to display Firday.
public class q4 {
    enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        // Access and display Friday
        DayOfWeek friday = DayOfWeek.FRIDAY;
        System.out.println("Day of the week for Friday: " + friday);
    }
}
