import java.util.Scanner;

public class Guess {
    private static Scanner scan = new Scanner(System.in);

    // Method to ask for users guess
    public static String guessLetter(){
        System.out.println("Guess the word or a letter and press enter:");
        return scan.next().toLowerCase();
    }
}