package Account;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        //add actions for withdraw and deposit, use switch case and while loop
        Scanner scanner = new Scanner(System.in);
        int actionNumber = 0;
        while (actionNumber != 9) {
            System.out.println("Enter: \n1: Deposit funds\n2: Check balance\n9: Exit");
            actionNumber = scanner.nextInt();
            if (actionNumber == 1) {
                System.out.println("Enter amount to deposit:");
                double number = scanner.nextInt();
                account.depositFunds(number);
                System.out.println("Current balance: $" + account.getBalance());
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

        public double intToDouble(int number) {
             double newDouble = number;
             return newDouble;
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