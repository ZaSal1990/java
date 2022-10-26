import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();//prompts to read from next line
        System.out.println("Welcome " + name + "!");
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();//if use nextLine, parseString() will be required
        System.out.println("You are " + (2022 - yearOfBirth) + " years old as of today!");
        scanner.close(); //to free up resources
    }
}