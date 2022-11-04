import java.util.Scanner;

public class t2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        String s = scanner.nextLine();
        String[] array = s.split(" ");
        String res = "";
        for(int i = 0; i<array.length; i++) {
            res = res + array[array.length-i-1] + " ";
        }
        System.out.println(res);
    }
}
