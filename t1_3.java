import java.util.Arrays;
import java.util.Scanner;

public class t1_3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String n = scanner2.nextLine();
        String[] numb = n.split(" ");
        double sum = 0;
        for(int i = 0; i<numb.length; i++) {
            int num = Integer.parseInt(numb[i]);
            sum += num;
        }
        double mean = sum/count;
        double sum2 = 0;
        for(int i = 0; i<numb.length; i++) {
            int num = Integer.parseInt(numb[i]);
            sum2 += Math.pow(num-mean,2);
        }
        double dev = Math.sqrt(sum2/count);
        System.out.println("mean = " + mean + " deviation  = " + dev);
    }
}