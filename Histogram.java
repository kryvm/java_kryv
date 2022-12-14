import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
    double min_hist;
    double max_hist;
    int m;
    int[] frequency;

    double[] numbers;

    double[] borders;

    Scanner scanner = new Scanner(System.in);

    public Histogram(){}

    public void input()
    {
        System.out.print("\nM = ");
        int m = (scanner.nextInt());
        System.out.print("\nn of data = ");
        int n = scanner.nextInt();
        System.out.print("\ndata = ");
        double[] k = new double[n];
        for (int i = 0; i < n; i++)
        {
            double t;

            t = scanner.nextDouble();
            k[i] = t;
        }
        Histogram hist = new Histogram(k,m);
        this.min_hist = hist.min_hist;
        this.max_hist = hist.max_hist;
        this.m = hist.m;
        this.borders = hist.borders;
        this.numbers = hist.numbers;
        this.frequency = hist.frequency;
    }

    public Histogram(double[] nums, int n) {
        Arrays.sort(nums);
        this.numbers = nums;
        this.min_hist = nums[0];
        this.max_hist = nums[nums.length - 1];
        this.m = n;
        this.frequency = new int[this.m];
        this.borders = new double[this.m - 1];
        for (int i = 0; i < this.m; i++) {
            this.frequency[i] = 0;
        }
        for (int i = 0; i < this.m - 1; i++) {
            this.borders[i] = 0;
        }
        this.reassign();
    }

    public Histogram (String filename) {
        try{
            Scanner scanner = new Scanner(new File(filename));
            String n1 = scanner.nextLine();
            int m1 = Integer.parseInt(n1);
            String n2 = scanner.nextLine();
            String[] m2 = n2.split(" ");
            double[] numbers = new double[m2.length];
            int j = 0;
            for(String i : m2){
                numbers[j] = Double.parseDouble(i);
                j++;
            }
            Histogram hist = new Histogram(numbers,m1);
            this.min_hist = hist.min_hist;
            this.max_hist = hist.max_hist;
            this.m = hist.m;
            this.borders = hist.borders;
            this.numbers = hist.numbers;
            this.frequency = hist.frequency;
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    //pushing element into array
    public static double[] addX(int n, double[] arr, double x) {
        int i;
        double[] newarr = new double[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }

    //recompute all values after adding a number into histogram
    public void reassign() {
        Arrays.sort(this.numbers);
        double step = (this.max_hist - this.min_hist) / this.m;
        for (int i = 0; i < this.m; i++) {
            this.frequency[i] = 0;
        }
        // m - 1 borders
        for (int i = 0; i < this.m - 1; i++) {
            this.borders[i] = this.min_hist + step * (1 + i);
        }
        for (double i : this.numbers) {
            int j = 0;
//            System.out.println("i = " + i);
            if (i < this.borders[0]) {
                this.frequency[0] += 1;
            } else if (i > this.borders[this.m - 2]) {
                this.frequency[this.m - 1] += 1;
            } else {
                while (i > this.borders[j]) {
//                    System.out.println(i + " " + this.borders[j] + " : " + j);
                    j++;
                }
//                System.out.println(i + " " + this.borders[j] + " : " + j);
                this.frequency[j] += 1;
            }
        }
    }


    public void setMax(double n) {
        this.max_hist = n;
        this.reassign();
    }

    public void setMin(double n) {
        this.min_hist = n;
        this.reassign();
    }

    public void setM(int n) {
        this.m = n;
        this.reassign();
    }

    public void addNumber1(double x) {
        //numbers not in [min,max] doesnt add into histogram
        if (x<this.min_hist || x>this.max_hist) {
            System.out.println("x not in [min,max]");
        }
        else {
            double[] arr = this.numbers;
            this.numbers = addX(arr.length, arr, x);
            this.reassign();
        }
    }

    public void addNumber2(double x) {
        //x>max => x=max; simmilar to min
        if (x<this.min_hist) {
            double[] arr = this.numbers;
            this.numbers = addX(arr.length, arr, this.min_hist);
            this.reassign();
        }
        else if(x>this.max_hist) {
            double[] arr = this.numbers;
            this.numbers = addX(arr.length, arr, this.max_hist);
            this.reassign();
        }
        else {
            double[] arr = this.numbers;
            this.numbers = addX(arr.length, arr, x);
            this.reassign();
        }
    }

    public void addNumber3(double x) {
        //x>max => max = x; simmilar to min
        if (x<this.min_hist) {
            this.min_hist = x;
            double[] arr = this.numbers;
            this.numbers = addX(arr.length, arr, x);
            this.reassign();
        }
        else if(x>this.max_hist) {
            this.max_hist = x;
            double[] arr = this.numbers;
            this.numbers = addX(arr.length, arr, x);
            this.reassign();
        }
        else {
            double[] arr = this.numbers;
            this.numbers = addX(arr.length, arr, x);
            this.reassign();
        }
    }

    public void addBatch1(double[] data) {
        for (int i = 0; i < data.length; i++) {
            this.addNumber1(data[i]);
        }
    }

    public void addBatch2(double[] data) {
        for (int i = 0; i < data.length; i++) {
            this.addNumber2(data[i]);
        }
    }

    public void addBatch3(double[] data) {
        for (int i = 0; i < data.length; i++) {
            this.addNumber3(data[i]);
        }
    }

    public int num(){
        return this.numbers.length;
    }

    public int numHist(int i){
        return this.frequency[i];
    }

    public double mean() {
        double summa = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            summa += this.numbers[i];
        }
        return summa / this.numbers.length;
    }

    public double median() {
        double[] arr = this.numbers;
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            return arr[(arr.length + 1) / 2 - 1];
        }
        else {
            return (arr[arr.length/2 - 1] + arr[(arr.length/2)] ) / 2;
        }
    }

    public double variance(){
        double sum = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            sum += Math.pow(this.numbers[i] - this.mean(),2);
        }
        double res = sum/this.numbers.length;
        return res;
    }
    public double dev()
    {
        return Math.sqrt(variance());
    }

    public double asymmetry(){
        double mean = this.mean();
        double moment = 0;
        for (double i : this.numbers) {
            moment += Math.pow((i - mean),3);
        }
        moment /= this.numbers.length;
        return moment/ Math.pow(this.dev(),3);
    }
    public double excess()
    {
        double mean = this.mean();

        double moment = 0;
        for (double i : this.numbers) {
            moment += Math.pow((i - mean),4);
        }
        moment /= this.numbers.length;
        return moment / Math.pow(this.dev(), 4);
    }

    public void print() {
        System.out.println("\n print of hist: \n");
        System.out.println("\nM = " + this.m);
        System.out.println("\nmin_hist_ = " + this.min_hist);
        System.out.println("\nmax_hist_ = " + this.max_hist);
        System.out.print("\nfrequencies = ");
        for (int i = 0; i < this.m; i++) {
            System.out.print(frequency[i] + ", ");
        }
        System.out.println("\n");
    }

    public double range(){
        return this.max_hist - this.min_hist;
    }

    public double err()
    {
        return (this.max_hist - this.min_hist) / 2 * this.m;
    }


}
