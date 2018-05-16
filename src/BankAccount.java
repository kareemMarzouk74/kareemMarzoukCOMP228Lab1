/*In this exercise you will develop a Java application that allows the user to process account information.
Create a class named BankAccount.
A bank account contains information about account number, owner's name, and the balance.
Provide a constructor that allows the user to initialize account data. Provide all getter methods.
Provide the necessary methods that allow the user to withdraw or deposit money.
Provide a getAccountInfo method to return account information in a nicely formatted string.*/
public class BankAccount {
    //Instance Variables
    String accountNumber;
    String ownerName;
    double balance;
    String userInput;
    double finalAmount;

    //Getter Method
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    //Constructor
    public BankAccount(String accountNumber, String ownerName, double balance, double finalAmount){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.userInput = userInput;
        this.finalAmount = finalAmount;
    }

    //getAccountInfo
    public String getAccountInfo(){
        return "\nAccount Number: " + accountNumber + "\n" + "Owner's Name: " + ownerName + "\n" + "Balance: $" + (balance - finalAmount) ;
    }
    public String getAccountInfo2(){
        return "\nAccount Number: " + accountNumber + "\n" + "Owner's Name: " + ownerName + "\n" + "Balance: $" + (balance + finalAmount);
    }

}
