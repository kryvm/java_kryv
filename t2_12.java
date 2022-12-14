import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class t2_12 {
    public static boolean isSymmetry(String a) {
        if (!a.equals("")){
            String[] arr = a.split("");
            for (int i = 0; i < a.length()/2; i++) {
                if(!Objects.equals(arr[i], arr[a.length() - i - 1])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scanner.nextLine();
        System.out.println(isSymmetry(s));


    }
}
