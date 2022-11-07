import java.util.Scanner;

public class t3_19 {
    public static int getCount(String s) {
        int count = s.split(",").length;
        return count;
    }

    public static int getCount(String[] s) {
        return s.length;
    }

    public static void main(String[] args) {
        String st;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        st = scanner.nextLine();
        System.out.println("From string with commas : " + Integer.toString(getCount(st)));
        System.out.println("From string[] : " + Integer.toString(getCount(st.split(","))));
    }
}
