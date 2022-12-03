public class Test_histogram {
    public static void main(String[] args) {
        Histogram hist = new Histogram(new double[] {0,1,2,3,4,5,6}, 7);
        hist.print();
        hist.addNumber1(9);
        hist.print();
        hist.addNumber2(9);
        hist.print();
        hist.addBatch3(new double[]{9});
        hist.print();
        System.out.println("variance is " + hist.variance());
        System.out.println("deviation is " + hist.dev());
        System.out.println("mean is " + hist.mean());
        System.out.println("median is " + hist.median());
        System.out.println("asymmetry is " + hist.asymmetry());
        System.out.println("excess is " + hist.excess());
        System.out.println("range is " + hist.range());
        System.out.println("er is " + hist.err());
        Histogram hist1 = new Histogram("input1.txt");
        hist1.print();
        Histogram hist2 = new Histogram();
        hist2.input();
        hist2.print();
    }
}
