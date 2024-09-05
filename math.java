
import java.util.Scanner;


public class math {
 public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int x = inputScanner.nextInt();

        System.out.println("Enter Second Number: ");
        int z = inputScanner.nextInt();

        inputScanner.close();

        System.out.println("Addition of the Number: " + (x+z));


        System.out.println(" Subtraction of the Number: " + (x - z));



        System.out.println(" Multiplication of the Number: " + (x * z));


        System.out.println(" Division of the Number: " + (x / z));

        System.out.println(" Modulus of the Number: " + (x % z));
    }

}
