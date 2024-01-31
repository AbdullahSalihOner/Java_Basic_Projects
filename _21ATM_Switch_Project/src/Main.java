import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        ATM PROJECT        ");

        Scanner input = new Scanner(System.in);
        String userName , password;

        int right = 3; // right is the number of attempts
        int balance = 1500; // balance is the amount of money in the account
        int select; // select is the operation that the user will choose

        while (right > 0) {
            System.out.print("User Name : ");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("salih") && password.equals("12345")) {
                System.out.println("Hello, Welcome to the Salih Bank");

                do {
                    System.out.println("1-DEPOSIT\n" +
                                       "2-WITHDRAW\n" +
                                       "3-CHECK BALANCE\n" +
                                       "4-EXIT");
                    System.out.print("Choose the operation : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Money Amount : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Your new Balance : " + balance);
                            break;
                        case 2:
                            System.out.print("Money Amount : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient Balance");
                            } else {
                                balance -= price;
                            }
                            System.out.println("Your new Balance : " + balance);
                            break;
                        case 3:
                            System.out.println("Your Balance : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again");
                break;
            } else {
                right--;
                System.out.println("Wrong User Name or Password");
                if (right == 0) {
                    System.out.println("Your account has been blocked");
                } else {
                    System.out.println("Try again");
                }
            }
        }
    }
}