public class t4_4 {
    public static void main(String[] args) {
        double a = 3;
        double b = 3.5 + 3*Math.pow(2,-111);
        double c = b;
        double perimeter = (a+b+c);
        double p = perimeter/2;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Square of triangle is %f, perimeter is %f",square,perimeter);
    }
}
