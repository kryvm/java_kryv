import java.util.Scanner;

public class t4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of numbers in a row: ");
        int n = scanner.nextInt();
        int count = 0;
        String s = "";
        for (int i = 10; i<91; i++) {
            s = s + Integer.toString(i) + " ";
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
