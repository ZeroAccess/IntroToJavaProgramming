package Chapter1;

/**
 * Created by robertsg on 5/18/2015.
 */
public class ten {
    public static void main(String[] args) {
        int distance = 14;
        double time = 45.30;
        double convertDistance;
        convertDistance = (distance * 0.6214);

        double answer = ((convertDistance * 60) / time);
        String result = String.format("%.2f", answer);



        System.out.println("The amount of miles ran is " + convertDistance);
        System.out.println("The mph for the runner is " + result);
    }
}
