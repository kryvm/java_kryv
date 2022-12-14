import java.util.Arrays;


public class Square {
    private double a;
    private double b;
    private double c;

    public Square(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    public double[] getRoots() {
        double d = Math.sqrt(Math.pow(b,2) - 4*a*c);
        double root1,root2;
        if (d<0) {
            return new double[] {};
        }
        else if(d==0) {
            root1 = -(this.b) / (2*this.a);
            root2 = root1;
            return new double[] {root1, root2};
        }
        else {
            root1 = (this.b + Math.sqrt(d)) / (2*this.a);
            root2 = (this.b - Math.sqrt(d)) / (2*this.a);

            return new double[] {root1, root2};
        }
    }

    public double getExtr() {
        return this.b/ (2*this.a);
    }

    public void increasingInterval() {
        if (this.a > 0) {
            System.out.println("Decreasing in (-inf;"+getExtr()+"), increasing in ("+getExtr()+")");
        }
        else {
            System.out.println("Increasing in (-inf;"+getExtr()+"), decreasing in ("+getExtr()+")");
        }
    }

    public String toString(){
        return this.a + "x^2 + " + this.b + "x + " + this.c + " = 0; roots is " + Arrays.toString(this.getRoots());
    }

    public static void main(String[] args) {
        Square eq1 = new Square(5,2,-4);
        Square eq2 = new Square(1,5,2);
        Square eq3 = new Square(5,2,2);
        Square eq4 = new Square(-1,2,3);
        Square eq5 = new Square(5,-22,-4);

        Square[] res = {eq1,eq2,eq3,eq4,eq5};
        double[] root = res[0].getRoots();

        Arrays.sort(root);
        System.out.println(Arrays.toString(root));
        double max = root[1];
        double min = root[0];
        System.out.println("max = "+max+" min = "+min);

        for (int i = 1; i<res.length;i++) {
            root = res[i].getRoots();
            Arrays.sort(root);
            System.out.println(Arrays.toString(root));
            if (root[1]>max) {
                max = root[1];
            }
            if (root[0]<min) {
                min = root[0];
            }
            System.out.println("max = "+max+" min = "+min);
        }

    }

}
