package Chapter1;

/**
 * Created by robertsg on 5/19/2015.
 */
public class eleven {
    public static void main(String[] args) {
        int years = 1;
        int secondsInAYear = 31536000;
        double birthsInAYear = (secondsInAYear / 8);
        double deathsInAYear = (secondsInAYear / 13);
        double immigrantsInAYear = (secondsInAYear / 33);
        double populationInProgress = 320906805;

        while (years < 6) {

            double currentPopulation = populationInProgress + birthsInAYear - deathsInAYear + immigrantsInAYear;
            String result = String.format("%1$,.2f", currentPopulation);

            if (years == 1) {
                System.out.println("The Population of the US would be " + result + " after " + years+ " year.");
            } else {
                System.out.println("The Population of the US would be " + result + " after " + years+ " years.");
            }
            populationInProgress = currentPopulation;
            years++;
        }
    }
}
