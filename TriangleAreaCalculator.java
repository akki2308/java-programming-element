import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516;  // 1 square inch = 6.4516 square cm

        System.out.println("The area of the triangle is " + areaCm2 + " square cm and " + areaIn2 + " square inches.");

        sc.close();
    }
}
