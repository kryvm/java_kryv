import java.io.FileNotFoundException;

public class Test_histo {
    public static void main(String[] args) throws FileNotFoundException {
        Histo hist = new Histo(0,6,7);
        hist.addNumber1(9);
        hist.print();
        hist.addBatch2(new double[]{9});
        hist.print();
        hist.addFromFile("input2.txt");
        hist.print();
        System.out.println("variance is " + hist.variance());
        System.out.println("deviation is " + hist.dev());
        System.out.println("mean is " + hist.mean());
        System.out.println("median is " + hist.median());
        System.out.println("asymmetry is " + hist.asymmetry());
        System.out.println("excess is " + hist.excess());
        System.out.println("range is " + hist.range());
        System.out.println("er is " + hist.err());
        hist.print();
        Histo hist2 = new Histo();
        hist2.input();
        hist2.print();
    }
}
