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
    }
}