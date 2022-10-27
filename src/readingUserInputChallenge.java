import java.util.Scanner;

public class readingUserInputChallenge {

    public static void main(String[] args) {
    int counter = 1;
    int sum = 0;
        Scanner scanner = new Scanner(System.in);
            while(counter <= 10) {
                System.out.println("Enter number #" + counter + ":");
                int number = scanner.nextInt();//prompts to read from next line
                sum += number;
                counter++;
            }
            System.out.println("The total is: " + sum);
        scanner.close();
    }
}
