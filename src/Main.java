import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner sc = new Scanner(file);
        try {
            double a = sc.nextDouble();
            String s = sc.next();
            double b = sc.nextDouble();
            switch (s) {
                case ("+"):
                    System.out.printf("%.1f", a + b);
                    break;
                case ("-"):
                    System.out.printf("%.1f", a - b);
                    break;
                case ("*"):
                    System.out.printf("%.1f", a * b);
                    break;
                case ("/"):
                    if (b == 0) throw new ArithmeticException();
                    System.out.printf("%.1f", a / b);
                    break;
                default:
                    System.out.println("Operation Error!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error! Not number");
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero");
        }
    }
}
