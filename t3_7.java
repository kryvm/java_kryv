import java.util.Scanner;

public class t3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mult = 6.673*Math.pow(10,-11);
        System.out.println("Enter m1,m2 and r respectively: ");
        double m1 = scanner.nextDouble();
        double m2 = scanner.nextDouble();
        double r = scanner.nextDouble();
        double f = mult*m1*m2/Math.pow(r,2);
        System.out.printf("F = %.3e",f);
    }
}
