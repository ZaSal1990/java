public class DataTypes {
    public static void main(String[] args) {
        long dataLong = 1_234_567_890L; //notice L at the end for explicit declaration
        float myFloatValue = 2.55F;
        float myNewFloatValue = (float) 2.55;
        byte myMinByteValue = Byte.MIN_VALUE;
        String myNewString = "My name is ";
        byte myNewByte = (byte) (myMinByteValue / 2); //notice (byte) to fix compatibility issue
        System.out.println("myNewByte value is " + myNewByte);
        System.out.println(myNewString + "Zahra!");

        String numberOne = "1";
        String numberTwo = "2";
        int numberThree = 3;
        System.out.println(numberOne + numberTwo);
        System.out.println(numberThree + numberOne); //if one param is string, string append is performed


    }
}