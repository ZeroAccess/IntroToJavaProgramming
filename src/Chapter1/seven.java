package Chapter1;

/**
 * Created by robertsg on 5/18/2015.
 */
public class seven {

    public static void main(String[] args) {
        double i = 0.0;
        double j = 0.0;
        double x = 0.000000;


        i = 4 * (1.0 - (1/3d) + (1/5d) - (1/7d) + (1/9d) - (1/11d));
        j = 4 * (1.0 - (1/3d) + (1/5d) - (1/7d) + (1/9d) - (1/11d) + (1/13d));
        x = 4 * (1.0 - (1/3d) + (1/5d) - (1/7d) + (1/9d) - (1/11d) + (1/13d));

        System.out.println(i);
        System.out.println(j);
        System.out.println(x);
    }

}
