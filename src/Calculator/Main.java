package Calculator;

public class Main {

    public static void main(String[] args) {
            calculator calculation = new calculator();
            calculation.setFirstNumber(1);
            calculation.setSecondNumber(2);
            System.out.println("First Number: " + calculation.getFirstNumber());
            System.out.println("Second Number: " + calculation.getSecondNumber());
    }

    public static class calculator {
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber() {
            return firstNumber;
        }

        public double getSecondNumber() {
            return secondNumber;
        }

        public double setFirstNumber(double newNumber) {
            return this.firstNumber = newNumber;
        }

        public double setSecondNumber(double newNumber) {
            return this.secondNumber = newNumber;
        }

        public double getAdditionResult() {
            return this.firstNumber + this.secondNumber;
        }

        public double getSubtractionResult() {
            return this.firstNumber - this.secondNumber;
        }

        public double getMultiplicationResult() {
            return this.firstNumber * this.secondNumber;
        }

        public double getDivisionResult() {
            if (this.secondNumber == 0) return 0;
            else return this.firstNumber / this.secondNumber;
        }
    }

}