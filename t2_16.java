import java.util.Scanner;

public class t2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers respectively: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        String num1 = Integer.toBinaryString(number1);
        String num2 = Integer.toBinaryString(number2);
        System.out.println(num1);
        System.out.println(num2);
        int res1 = 0;
        int res2 = 0;
        if (num1.length()>num2.length()) {
            for (int i = 0; i<num2.length(); i++){
                if(num1.split("")[num1.length()-i-1].equals(num2.split("")[num2.length()-i-1])) {
                    res1 += 1;
                    if (num1.split("")[num1.length()-i-1] == "1") {
                        res2 += 1;
                    }
                }
            }
        }
        else {
            for (int i = 0; i<num1.length(); i++){
                if(num1.split("")[num1.length()-i-1].equals(num2.split("")[num2.length()-i-1])) {
                    res1 += 1;
                    if (num1.split("")[num1.length()-i-1].equals("1")) {
                        res2 += 1;
                    }
                }
            }
        }
        System.out.println("res1 = " + res1 + ", res2 = " + res2);
    }
}
