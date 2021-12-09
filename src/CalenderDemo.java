//Demonstrate Calendar.
import java.util.Calendar;
public class CalenderDemo {
    public static void main(String[] args) {
        String months[]={ "JAN","FEB","MAR","APR","MAY","JUNE","JULY","AUG","SEPT","OCT","NOV","DEC"};
        //Create a calender initialized with the current date and time in the default lacale and timezone.
        Calendar calendar= Calendar.getInstance();
        //Display current time and date information.
        System.out.println("Date:");
        System.out.println(months[calendar.get(Calendar.MONTH)]);
        System.out.println(" "+calendar.get(Calendar.DATE)+" ");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println("Time:");
        System.out.println(calendar.get(Calendar.HOUR)+":");
        System.out.println(calendar.get(Calendar.MINUTE)+":");
        System.out.println(calendar.get(Calendar.SECOND));
        //Set the time and date information and display it.
        calendar.set(Calendar.HOUR,10);
        calendar.set(Calendar.MINUTE,29);
        calendar.set(Calendar.SECOND,22);
        System.out.println("Updated time:");
        System.out.println(calendar.get(Calendar.HOUR)+":");
        System.out.println(calendar.get(Calendar.MONTH)+":");
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
