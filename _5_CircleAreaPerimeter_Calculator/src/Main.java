import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("    CIRCLE AREA AND PERIMETER    ");

        int r; // radius
        double pi = 3.14 ; // pi number

        Scanner input = new Scanner(System.in);

        System.out.print(" enter the radius : ");
        r = input.nextInt();
        double area = pi * r * r ; // area formula
        double perimeter = 2 * pi * r ; // perimeter formula

        System.out.println(" Circle Area : " + area);
        System.out.println(" Circle Perimeter : " + perimeter);

    }
}