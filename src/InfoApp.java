import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InfoApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String alphabet = "^[a-zA-Z]*$";
        String numbersWithDot = "^[0-9.]*$";

        System.out.print("Full name: ");
        String name = scanner.nextLine();
        if (!Pattern.matches(alphabet, name)){
            throw new InputMismatchException("Full name cannot contain a number");
        }

        System.out.print("Birthday: ");
        String birthday = scanner.nextLine();
        if (!Pattern.matches(numbersWithDot, birthday)){
            throw new InputMismatchException("Birthday must have only numbers");
        }

        System.out.print("Age: ");
        int age = scanner.nextInt();
    }
}
