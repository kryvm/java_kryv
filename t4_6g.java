import java.util.Scanner;

public class t4_6g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        double f = Math.atan(x);
        double derF = 1/(1+x*x);
        System.out.printf("Function = %f\n Derivative = %f",f,derF);
    }
}
