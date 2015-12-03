package Chapter2;

import java.util.Scanner;

/**
 * Created by robertsg on 5/28/2015.
 */
public class two {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double value: ");
        double number1 = input.nextDouble();

        System.out.println("The number you entered was " + number1);
    }
}
