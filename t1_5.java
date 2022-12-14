import java.util.Arrays;
import java.util.Scanner;

public class t1_5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter x y z: ");
        String point = scanner1.nextLine();
        String[] numb = point.split(" ");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter x y z many times for each point in one row: ");
        String n = scanner2.nextLine();
        String[] pt = n.split(" ");

        double max_dist = 0;
        double dist = 0;
        String pt1 = "";
        for(int i = 0; i<pt.length/3;i++) {
            double x1 = Integer.parseInt(pt[3*i + 0]);
            double y1 = Integer.parseInt(pt[3*i + 1]);
            double z1 = Integer.parseInt(pt[3*i + 2]);

            double x0 = Integer.parseInt(numb[0]);
            double y0 = Integer.parseInt(numb[1]);
            double z0 = Integer.parseInt(numb[2]);
            dist = Math.sqrt( Math.pow((x1-x0),2) + Math.pow((y1-y0),2) + Math.pow((z1-z0),2));
            if (max_dist < dist) {
                max_dist = dist;
                pt1 = "x = " + pt[3*i + 0] + " y = " + pt[3*i + 1] + " z = " + pt[3*i + 2];
            }
        }
        System.out.println("Coords: " + pt1 + " Distance = " + max_dist);
    }
}