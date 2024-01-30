import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         System.out.println("            PRIME NUMBERS CALCULATOR WITH RECURSIVE          ");

         Scanner scn = new Scanner(System.in);
         System.out.println("Enter your number : ");
         int number = scn.nextInt();

            prime(number,2);
    }

    static void prime(int a , int n){ // a = number , n  is value that we divide to number
        if (n == a){
            System.out.println(a + " is Prime number");
            return;
        }
        else if (a % n == 0) {
            System.out.println(a +" is not a Prime Number");
            return;
        }

        prime(a , n+1); // recursive
    }
}