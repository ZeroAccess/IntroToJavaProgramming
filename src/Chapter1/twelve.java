package Chapter1;

/**
 * Created by robertsg on 5/19/2015.
 */
public class twelve {
    public static void main(String[] args) {
        int runnerMiles = 24;
        double runnerTime = 6035/60.0;
        double runnerKM = (runnerMiles * 1.60934);
        double answer = (runnerKM / runnerTime)*60;
        String result = String.format("%.2f", answer);
//  This gives a different answer than the book and they did it differently so I dunno but I'm close so not sure what's going on
        System.out.println("The average speed in kilometers is " + result + " KM/H's.");

    }
}
