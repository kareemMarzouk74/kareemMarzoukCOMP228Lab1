/*
Write a driver class to test the bank account.
The driver class (main class) interacts with the user and calls BankAccount methods to initialize or update the account.

Use the methods of JOptionPane class to provide input/output in the driver class.
*/

import java.util.Scanner;

public class TestBankAccount {
    public static void main(String[] args) {
        //Read User's Input
        Scanner input = new Scanner(System.in);
        BankAccount account1 = new BankAccount("","",0, 0);

        //Ask user to enter their info.
        System.out.println("Enter Account Number: ");
        String accntNumber = input.nextLine();
        account1.setAccountNumber(accntNumber);

        System.out.println("Enter Owner's Name: ");
        String ownerName = input.nextLine();
        account1.setOwnerName(ownerName);

        System.out.println("Enter Balance: ");
        double balance = input.nextDouble();
        account1.setBalance(balance);

        //Additional line because the previous input.nextDouble() skips the next line
        System.out.println("");
        String space = input.nextLine();

        //Asks user to withdraw or Deposit
        System.out.println("Withdraw or Deposit?(0/1) ");
        int userInput = input.nextInt();




        //If statement for withdraw or deposit
        if (userInput == 0) {
            System.out.println("Enter Amount: ");
            double finalAmount = input.nextDouble();
            account1.setFinalAmount(finalAmount);

            double money;

            money = balance - finalAmount;

            System.out.println("You have withdrew $" + finalAmount);
            System.out.println("Your total is: $" + money);

            //Summary message if Withdrawn
            System.out.printf("\nAccount info: %s%n", account1.getAccountInfo());
        }

        if (userInput == 1){
            System.out.println("Enter Amount: ");
            double finalAmount = input.nextDouble();
            account1.setFinalAmount(finalAmount);


            double money;

            money = balance + finalAmount;

            System.out.println("You have Deposited $" + finalAmount);
            System.out.println("Your total is: $" + money);

            //Summary message if Deposited
            System.out.printf("\nAccount info: %s%n", account1.getAccountInfo2());
        }
    }

}
