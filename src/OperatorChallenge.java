public class OperatorChallenge {
    public static void main (String[] args) {

        double myDoubleOne = 20.0;
        double myDoubleTwo = 80.0;
        double result = (myDoubleOne + myDoubleTwo) * 100;
        double myRemainder = result % 40.0;
        boolean isRemainder = (myRemainder == 0) ? true : false;
        System.out.println(myRemainder);
         if (!isRemainder) {
             System.out.println("Got some remainder");
         }




    }

}