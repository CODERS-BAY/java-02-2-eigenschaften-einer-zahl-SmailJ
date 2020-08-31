import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = -9;
        int lucky = 7;

        if (number % 10 == 0) {
            System.out.println("Es handelt sich um eine runde Zahl");
        }
        if (number % 2 == 0) {
            System.out.println("Es handelt sich um eine gerade Zahl");
        }
        if (number == lucky) {
            System.out.printf("Es handelt sich um deine Glückszahl %s", lucky);
        }
        if (number >= 10 && number < 100 || number <= -10 && number > -100) {
            System.out.println("Es handelt sich um eine zweistellige Zahl");
        }

    }
}
