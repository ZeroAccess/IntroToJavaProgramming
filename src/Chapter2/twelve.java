package Chapter2;

/**
 * Created by robertsg on 5/28/2015.
 */
public class twelve {
    public static void main(String[] args){
        int day = (1 + 120)%7;
        String dayString;
        switch (day) {
            case 1: dayString = "Monday";
                break;
            case 2: dayString = "Tuesday";
                break;
            case 3: dayString = "Wednesday";
                break;
            case 4: dayString = "Thursday";
                break;
            case 5: dayString = "Friday";
                break;
            case 6: dayString = "Saturday";
                break;
            case 7: dayString = "Sunday";
                break;
            default: dayString = "Invalid Day";
                break;
        }
        System.out.println(dayString);
    }
}
