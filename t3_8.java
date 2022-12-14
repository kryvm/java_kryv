import java.util.Scanner;

public class t3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double n = scanner.nextDouble();
        System.out.println("Without functions:");
        if ( n >= 0) {
            int n1 = (int)n;
            double n2 = n - n1;
            System.out.printf("Celaya = %d, Drobnaya = %f, maximum lower/equal than n = %d, minimum higher/equal than n = %d\n",n1,n2,n1,n1+1);
        }
        else {
            int n1 = (int)n - 1;
            double n2 = n - n1;
            System.out.printf("Celaya = %d, Drobnaya = %f, maximum lower/equal than n = %d, minimum higher/equal than n = %d\n",n1,n2,n1,n1+1);
        }

        System.out.println("With functions:");
        int n1 = (int) Math.floor(n);
        double n2 = n - n1;
        System.out.printf("Celaya = %d, Drobnaya = %f, maximum lower/equal than n = %d, minimum higher/equal than n = %d\n",n1,n2,n1,n1+1);
    }
}
