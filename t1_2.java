
import java.util.Arrays;
import java.util.Scanner;

public class t1_2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String n = scanner1.nextLine();
        String[] numb = n.split(" ");
        int min = Integer.parseInt(numb[0]);
        int max = Integer.parseInt(numb[0]);
        for(int i = 0; i<numb.length; i++) {
            int num = Integer.parseInt(numb[i]);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("max = " + max + " min = " + min);
    }
}