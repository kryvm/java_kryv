import java.util.Scanner;
import java.util.Hashtable;

public class t4_1 {
    public static String Expansion(double p, double q) {
        String ans = Integer.toString((int) Math.floor(p/q)) + ".";
        Hashtable<String, String> dict = new Hashtable<String, String>();
        int index = 0;
        p = p%q;
        dict.put(Integer.toString((int) p), Integer.toString((int) index));
        boolean t = false;
        while(!t) {
            if(p == 0) {
                break;
            }
            int digit = (int) Math.floor(p*10/q);
            p = p*10 - ((int) Math.floor(p*10/q))*q;
            if (dict.get(Integer.toString((int) p)) == null) {
                ans = ans + Integer.toString(digit);
                index += 1;
                dict.put(Integer.toString((int) p), Integer.toString((int) index));
                t = false;
            }
            else {
                ans = ans + Integer.toString(digit) + ")";
                String[] arr = ans.split("");
                String test1 = "";
                for (int i = 0; i < ans.indexOf(".")+1; i++) {
                    test1 = test1 + arr[i];
                }
                int index1 = Integer.parseInt(dict.get(Integer.toString((int) p))) + test1.length();
                String ans1 = "";//from 0 to index1
                for (int i = 0; i < index1; i++) {
                    ans1 = ans1 + arr[i];
                }
                String ans2 = "";//from index1 to the end
                for (int i = index1; i<ans.length();i++) {
                    ans2 = ans2 + arr[i];
                }
                ans = ans1+"("+ans2;
                t = true;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press p and q: ");
        double p = scanner.nextInt();
        double q = scanner.nextInt();
        System.out.println(Expansion(p,q));
    }
}
