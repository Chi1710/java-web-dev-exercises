package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Double lengthRec;
        Double widthRec;
        Double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a length for the rectangle: ");
        lengthRec = input.nextDouble();

        System.out.println("Enter a width for the rectangle: ");
        widthRec = input.nextDouble();

        area = lengthRec * widthRec;
        System.out.println("The area of the rectangle is " + area);


    }


}
