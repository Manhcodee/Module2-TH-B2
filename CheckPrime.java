import javax.swing.text.Style;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not prime");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                check = true;
            }
            if (check) {
                System.out.println(number + " is prime");
            }else {
                System.out.println(number + " is not prime");
            }
        }
    }
}
