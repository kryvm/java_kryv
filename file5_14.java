package hw11;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class file5_14 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc1 = new Scanner(System.in);
        String n = sc1.nextLine();
        String t1 = n.split(" ")[0];
        String t2 = n.split(" ")[1];

        File file = new File("inp.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            String k = sc.nextLine();
            String sur = k.split(" ")[0];
            String name = k.split(" ")[1];
            //System.out.println(sur + name);
            if (Objects.equals(sur, t1) && Objects.equals(name, t2)){
                System.out.println(k.split(" ")[2]);
            }
        }
    }
}
