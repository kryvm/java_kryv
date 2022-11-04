import java.util.Scanner;

public class t3_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a+b+c)/2;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Square of triangle is %f",square);
    }
}
