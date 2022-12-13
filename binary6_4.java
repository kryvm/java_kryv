package hw11;

import java.io.*;

public class binary6_4 {

    public static void main(String[] args) throws IOException {
        File file = new File("F.dat");
        FileInputStream fin = new FileInputStream(file);
        BufferedInputStream bin = new BufferedInputStream(fin);
        DataInputStream din = new DataInputStream(bin);

        int count = (int) (file.length() / 4);
        int[] values = new int[count];
        for (int i = 0; i < count; i++) {
            values[i] = din.readInt();
        }

        int[] even = new int[count];
        int[] odd = new int[count];
        int count1 = 0;
        int count2 = 0;
        for (int i: values) {
            if ( i % 2 == 0){
                even[count1] = i;
                count1 += 1;
            }
            else{
                odd[count2] = i;
                count2 += 1;
            }
        }

        int[] even1 = new int[count1];
        int[] odd1 = new int[count2];
        for (int i = 0; i<count1; i++) {
            even1[i] = even[i];
        }
        for (int i = 0; i<count2; i++) {
            odd1[i] = odd[i];
        }

        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(
                "G.dat"));
        oos1.writeObject(even1);
        oos1.close();

        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(
                "H.dat"));
        oos2.writeObject(odd1);
        oos2.close();
    }
}
