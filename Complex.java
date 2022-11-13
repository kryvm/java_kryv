public class Complex {
    double real;
    double imaginary;

    public Complex(double r, double im) {
        this.real = r;
        this.imaginary = im;
    }
    public Complex plus(Complex n2) {
        return new Complex(this.real + n2.real, this.imaginary + n2.imaginary);
    }
    public Complex subtract(Complex n2) {
        return new Complex(this.real - n2.real, this.imaginary - n2.imaginary);
    }

    public double distance(Complex n2) {
        return Math.sqrt(Math.pow((this.real - n2.real),2) + Math.pow((this.imaginary - n2.imaginary),2));
    }
    public Complex multiply(Complex n2) {
        return new Complex(this.real*n2.real - this.imaginary*n2.imaginary, n2.real*this.imaginary + n2.imaginary*this.imaginary);
    }

}
