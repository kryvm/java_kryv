import java.util.Scanner;

public class t4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of numbers in a row: ");
        int n = scanner.nextInt();
        int count = 0;
        String s = "";
        for (int i = 10; i<1001; i++) {
            if (i <= 9) {
                s = s + Integer.toString(i) + "   ";
            }
            else if (i <= 99) {
                s = s + Integer.toString(i) + "  ";
            }
            else {
                s = s + Integer.toString(i) + " ";
            }
            count++;
            if (count==n){
                System.out.println(s);
                s = "";
                count = 0;
            }

        }
        if (!s.equals("")) {
            System.out.println(s);
        }
    }
}
