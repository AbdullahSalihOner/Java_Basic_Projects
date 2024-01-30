import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("   HYPOTENUSE CALCULATOR   ");

        double a,b,h;   // a and b are perpendicular edges, h is hypotenuse

        Scanner value = new Scanner(System.in);    // create a Scanner object
        System.out.print("Enter first perpendicular edge: ");
        a = value.nextDouble();

        System.out.print("Enter second perpendicular edge: ");
        b = value.nextDouble();

        h = Math.sqrt(a*a + b*b);   // calculate hypotenuse with Pythagorean theorem

        System.out.print("Hypotenuse: " + h);   // print hypotenuse
    }
}