package Chapter1;

/**
 * Created by robertsg on 5/12/2015.
 */
public class four {
    public static void main(String[] args) {
        //Print a table
        int i = 1;
        System.out.println("a   a^2     a^3");
        while (i < 4) {
            System.out.println(i+"   " + (int)Math.pow(i,2) +"       " + (int)Math.pow(i,3));
            i++;
            if (i ==4) {
                System.out.println(i+"   " + (int)Math.pow(i,2) +"      " + (int)Math.pow(i,3));
            }
        }

    }
}
