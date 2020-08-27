import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number=7;
        int lucky=7;
        String overTen="10";

        if(number%10==0){
            System.out.println("Es handelt sich um eine runde Zahl");
        }else if(number%2==0){
            System.out.println("Es handelt sich um eine gerade Zahl");
        }else if(number == lucky){
            System.out.printf("Es handelt sich um deine Glückszahl %s",lucky);
        }else if(number = String.valueOf(overTen)){

        }
        else{
            System.out.printf("Es handel sich um die Zahl %s",number);
        }

    }
}
