import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("     TAXIMETER CALCULATOR     ");

       int distance; // distance in km
        double perKm = 4.50, total, startPrice = 15;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter distance in km : ");
        distance = input.nextInt();

        total = distance * perKm;
        total += startPrice;

        total = (total < 20) ? 20 : total; // if total is less than 20, total = 20, else total = total
        System.out.println("Total Price : " + total);


    }
}