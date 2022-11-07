package Account;

public class Main {

    public static void main(String[] args) {

    }

    public static class bankAccount {
        private double accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private double phoneNumber;


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