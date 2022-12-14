import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histo {
    double min_hist;       // максимальне значення даних
    double max_hist;       // мінімальне значення даних
    int m;                  // кількість стовпців
    int[] frequency;        // замість даних - частоти у відповідних стовпцях
    double[] values; // встановлені приблизні значення для кожного стовпця

    Scanner scanner = new Scanner(System.in);

    public Histo(){}


    // values - приблизні значення стовбців
    public Histo(double min, double max, int n){
        this.min_hist = min;
        this.max_hist = max;
        this.m = n;
        this.frequency = new int[this.m];
        for (int i = 0; i < this.m; i++) {
            this.frequency[i] = 0;
        }
        this.values = new double[this.m];
        double step = (this.max_hist - this.min_hist ) / this.m;
        for (int i = 0; i < this.m; i++) {
            this.values[i] = this.min_hist + step*(2*i + 1);
        }
    }


    //recompute the approximately values of histogram
    public void revalue(){
        this.values = new double[this.m];
        double step = (this.max_hist - this.min_hist ) / this.m;
        for (int i = 0; i < this.m; i++) {
            this.values[i] = this.min_hist + step*(2*i + 1);
        }

    }

    public void addNumber1(double x) {
        //numbers not in [min,max] doesnt add into histogram
        if (x<this.min_hist || x>this.max_hist) {
            System.out.println("x not in [min,max]");
        }
        else {
            double step = (this.max_hist - this.min_hist ) / this.m;
            for (int i = 1; i < this.m + 1; i++)
            {
                if (this.min_hist + step * i >= x) {

                    this.frequency[i - 1]++;
                    break;
                }
            }
        }
        this.revalue();
    }

    public void addNumber2(double x) {
        //x>max => x=max; simmilar to min
        if (x<this.min_hist) {
            this.frequency[0] += 1;
        }
        else if (x > this.max_hist){
            this.frequency[this.m-1] += 1;
        }
        else {
            double step = (this.max_hist - this.min_hist ) / this.m;
            for (int i = 1; i < this.m + 1; i++)
            {
                if (this.min_hist + step * i >= x) {
                    this.frequency[i - 1]++;
                    break;
                }
            }
        }
        this.revalue();
    }

    public void setM(int n){
        this.m = n;
        this.revalue();
    }

    public void setMax_hist(double n){
        this.max_hist = n;
        this.revalue();
    }

    public void setMin_hist(double n){
        this.min_hist = n;
        this.revalue();
    }


    public void addBatch1(double[] data) {
        for (int i = 0; i < data.length; i++) {
            this.addNumber1(data[i]);
        }
        this.revalue();
    }

    public void addBatch2(double[] data) {
        for (int i = 0; i < data.length; i++) {
            this.addNumber2(data[i]);
        }
        this.revalue();
    }

    public void addFromFile(String fname) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fname));
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        for (String i:
             s1) {
            this.addNumber1(Double.parseDouble(i));
        }

    }

    public int num()
    {
        int res = 0;
        for (int i = 0; i < this.m; i++)
            res += this.frequency[i];
        return res;
    }

    public int numHist(int i)
    {
        if (!((i < 0) || (i > this.m - 1))) {
            return frequency[i];
        }
        return -1;
    }

    public double mean()
    {
        double res = 0;
        for (int i = 0; i < this.m; i++)
            res += this.values[i] * this.frequency[i];
        return res / this.num();
    }

    public void input() {
        System.out.print("\nm = ");
        int k = (scanner.nextInt());
        System.out.print("\nmin = ");
        double min = scanner.nextDouble();
        System.out.print("\nmax = ");
        double max = scanner.nextDouble();
        System.out.print("\nn of data = ");
        int n = scanner.nextInt();
        System.out.print("\nnumbers = ");
        Histo res = new Histo(min,max,k);
        double x;
        for (int i = 0; i < n; i++)
        {
            x = scanner.nextDouble();
            res.addNumber1(x);
        }
        this.m = res.m;
        this.min_hist = res.m;
        this.max_hist = res.max_hist;
        this.frequency = res.frequency;
        this.values = res.values;
        System.out.println("\n");
    }

    public double variance()
    {
        double res = 0;
        double mean = this.mean();
        for (int i = 0; i < this.m; ++i)
            res += (Math.pow(this.values[i] - mean, 2)) * this.frequency[i];
        return res / this.m;
    }

    public double dev()
    {
        return Math.sqrt(this.variance());
    }

    public double asymmetry()
    {
        int n = this.num();
        double mean = this.mean();
        double moment = 0;
        for (int i = 0; i < this.m; i++)
        {
            moment += (Math.pow(this.values[i] - mean, 3) * this.frequency[i]);
        }
        moment /= n;
        return moment / Math.pow(this.dev(), 3);
    }

    public double excess()
    {
        int n = this.num();
        double mean = this.mean();
        double moment = 0;
        for (int i = 0; i < this.m; i++)
        {
            moment += Math.pow(this.values[i] - mean, 4) * this.frequency[i];
        }
        moment /= n;
        return moment / Math.pow(this.dev(), 4);
    }

    public double range(){
        return this.max_hist - this.min_hist;
    }

    public double err()
    {
        return (this.max_hist - this.min_hist) / (2 * this.m);
    }

    public double getValue(int i){
        double n = 0;
        for (int j = 0; j < this.m; j++) {
            n += this.frequency[j];
            if(n>i)
            {
                return this.values[j];
            }
        }
        return -1;
    }

    public double median(){
        double ind = this.num()/2.0;
        int ind1;
        if(ind%1 == 0){
            ind1 = (int) (ind+1);
            return (getValue((int) ind)+getValue(ind1)) / 2;
        }
        else {
            return getValue((int) Math.floor(ind+1));
        }

    }

    public void print() {
        System.out.println(" print of hist: ");
        System.out.println("M = " + this.m);
        System.out.println("min_hist_ = " + this.min_hist);
        System.out.println("max_hist_ = " + this.max_hist);
        System.out.print("frequencies = ");
        for (int i = 0; i < this.m; i++) {
            System.out.print(frequency[i] + ", ");
        }
        System.out.println("\n");
    }

}
