package exercises;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args){
        Double numOfMiles;
        Double gasInGallons;
        Double milesPerGallon;

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles you have driven? ");
        numOfMiles = input.nextDouble();

        System.out.println("Whats the amount of gas in gallon you've consumed? ");
        gasInGallons = input.nextDouble();

        milesPerGallon = numOfMiles / gasInGallons;
        System.out.println("You are running on " + milesPerGallon + " mpg.");

    }
}
