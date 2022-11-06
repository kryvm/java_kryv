import java.util.Arrays;
import java.util.Scanner;

public class t1_19 {
    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String num = scanner2.nextLine();
        String[] arr = num.split(" ");
        int[] numbers = new int[arr.length];
        for(int i = 0;i < arr.length;i++)
        {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        boolean cache = false;
        int count = 0;
        int i = 0;
        while(i<n-1) {
            if(numbers[i] == numbers[i+1]) {
                count += 1;
                cache = true;
                i++;
            }
            else {
                if(cache == true) { // i-count   {0,1,1,1,1,2,3,4}
                    for (int j = count; j>0;j--) {
                        numbers = removeTheElement(numbers, i);
                        i--;
                    }
                    numbers[i] += 1;
                    n -= count;
                    count = 0;
                    cache = false;
                    i = 0;
                }
                else {
                    i++;
                }
            }
        }
        if (numbers[n-1] == numbers[n-2])
        {
            numbers = removeTheElement(numbers,n-1);
            numbers[n-2] += 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}