import java.util.Scanner;

public class readingUserInputChallenge {

    public static void main(String[] args) {
    int counter = 1;
    int sum = 0;
        Scanner scanner = new Scanner(System.in);
            while(counter <= 10) {
                System.out.println("Enter number #" + counter + ":");
               boolean isAnInt = scanner.hasNextInt();//prompts to read from next line
                if (isAnInt) {
                    int number = scanner.nextInt();
                    sum += number;
                    counter++;
                } else {
                    System.out.println("Invalid Number");
                    }
            }
            System.out.println("The total is: " + sum);
        scanner.close();
    }
}
