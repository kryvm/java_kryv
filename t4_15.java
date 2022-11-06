import java.util.Scanner;

public class t4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients a, b and c each in separate row: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double D = b*b - 4*a*c;
        if(D>0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            int count = 0;
            if (x1 > 0) {
                System.out.println("Solution is " + Math.sqrt(x1));
                System.out.println("Solution is " + -1*Math.sqrt(x1));
                count++;
            }
            if (x2 > 0) {
                System.out.println("Solution is " + Math.sqrt(x2));
                System.out.println("Solution is " + -1*Math.sqrt(x2));
                count++;
            }
            if (count==0) {
                System.out.println("Any solutions");
            }
        }
        else if (D == 0) {
            double x;
            x = -b / (2*a);
            if (x > 0) {
                System.out.println("Solution is " + Math.sqrt(x));
            }
            else {
                System.out.println("Any solutions");
            }
        }
        else {
            System.out.println("Any solutions");
        }
    }
}
