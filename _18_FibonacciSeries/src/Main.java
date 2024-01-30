import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        FIBONACCI SERIES CALCULATOR      ");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N number : ");
        int n = input.nextInt();

        int n1=0,n2=1,n3; // n1 = 0 , n2 = 1 , n3 = 0

        System.out.print(n1+" "+n2); // 0 1

        for (int i = 2 ; i<n ; i++){
            n3 = n1 + n2; // 0 + 1 = 1
            System.out.print(" "+n3); // 0 1 1
            n1 = n2; // n1 = 1
            n2 = n3; // n2 = 1
        }
    }
}