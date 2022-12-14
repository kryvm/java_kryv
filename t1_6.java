import java.util.Arrays;
import java.util.Scanner;

public class t1_6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String point = scanner1.nextLine();
        String[] numb = point.split(" ");

        int max_count = 0;
        String res = "";
        for (int i = 0; i < numb.length; i++) {
            if(numb[i].split("").length > max_count) {
                max_count = numb[i].split("").length;
                res = "" + numb[i];
            }
            else if (numb[i].split("").length == max_count) {
                res = res += " " + numb[i];
            }
        }
        System.out.println(res);
    }
}