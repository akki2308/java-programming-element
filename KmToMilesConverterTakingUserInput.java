import java.util.Scanner;

public class KmToMilesConverterTakingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, miles;
        double conversionFactor = 1.6;

        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();
        miles = km / conversionFactor;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        sc.close();
    }
}
