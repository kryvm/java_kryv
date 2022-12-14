import java.util.Random;
import java.util.Scanner;

public class t2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter two numbers respectively: ");
        int number1 = scanner.nextInt();
        String s = "";
        for(int i = 0; i < number1; i++) {
            int randomint = rand.nextInt(100);
            System.out.println(randomint);
            s = s + String.valueOf(randomint) + " ";
        }
        System.out.println(s);
    }
}
