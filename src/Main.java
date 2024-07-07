import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        File file1 = new File("zapis.txt");
        PrintWriter zapis = new PrintWriter(file1);
        Scanner sc = new Scanner(file);
        try {
            double a = sc.nextDouble();
            String s = sc.next();
            double b = sc.nextDouble();
            switch (s) {
                case ("+"):
                    zapis.printf("%.1f", a + b);
                    break;
                case ("-"):
                    zapis.printf("%.1f", a - b);
                    break;
                case ("*"):
                    zapis.printf("%.1f", a * b);
                    break;
                case ("/"):
                    if (b == 0) throw new ArithmeticException();
                    zapis.printf("%.1f", a / b);
                    break;
                default:
                    zapis.println("Operation Error!");
            }
        } catch (InputMismatchException e) {
            zapis.println("Error! Not number");
        } catch (ArithmeticException e) {
            zapis.println("Error! Division by zero");
        }
        sc.close();
        zapis.close();
    }
}
