package Account;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bankAccount account = new bankAccount();
        System.out.println("Lets set you up as a user first");
        int actionNumber = 0;
        while (actionNumber != 9) {
            actionNumber = account.userInput(scanner); // to keep coming back to asking user input after each operation
            if (actionNumber == 1) {
                System.out.println("Enter amount to deposit:");
                System.out.println("Your current balance is: $" + account.depositFunds(scanner.nextInt()));
            }
        }
        scanner.close();
        System.out.println("Thank you for choosing us!");
    }

    public static class bankAccount {
        private double accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private double phoneNumber;

        public int userInput(Scanner scanner) { //passing instance as argument
            System.out.println("Enter: \n1: Deposit funds\n2: Check balance\n9: Exit");
            int userInput = scanner.nextInt();
            return userInput;
        }

        public double getAccountNumber() {
            return accountNumber;
        }
        public double getBalance() {
            return balance;
        }
        public String getCustomerName (){
            return customerName;
        }
        public String getEmail () {
            return email;

        }
        public double getPhoneNumber (){
            return phoneNumber;
        }

        public double setAccountNumber (double number) {
           return  accountNumber = number;
        }
        public double setBalance (double number) {
            return  balance = number;
        }
        public String setCustomerName (String text) {
            return customerName = text;
        }
        public String setEmail (String text) {
            return  email = text;
        }
        public double setPhoneNumber (double number) {
            return  phoneNumber = number;
        }

        public double depositFunds (double increment) {
            return balance += increment;
        }
        public double withdrawFunds (double decrement) {
            if (balance > decrement)
            return balance -= decrement;
            else System.out.println("Insufficient balance!");
            return 0;
        }
    }
}