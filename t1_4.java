import java.util.Arrays;
import java.util.Scanner;

public class t1_4 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String n = scanner2.nextLine();
        String[] numb = n.split(" ");
        int count = 1;
        int maxcount = 0;
        int number = 0;
        for (int i = 0; i<numb.length-1; i++) {
            if (Integer.parseInt(numb[i]) == Integer.parseInt(numb[i+1])) {
                count++;
            }
            else {
                if(maxcount < count) {
                    maxcount = count;
                    number = Integer.parseInt(numb[i]);
                }
                else if (maxcount == count && Integer.parseInt(numb[i]) > number) {
                    number = Integer.parseInt(numb[i]);

                }
                count = 1;
            }
        }
        if(maxcount < count) {
            maxcount = count;
            number = Integer.parseInt(numb[numb.length-1]);
        }
        else if (maxcount == count && Integer.parseInt(numb[numb.length-1]) > number) {
            number = Integer.parseInt(numb[numb.length-1]);

        }
        System.out.println(maxcount+ " підряд чисел " + number);
    }
}