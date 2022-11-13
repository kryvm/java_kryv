public class Point {
    private final Complex x;
    private final Complex y;
    private final Complex z;

    public Point(Complex n1, Complex n2, Complex n3) {
        this.x = n1;
        this.y = n2;
        this.z = n3;
    }

    public double getDistance(Point p2) {
        double dx = x.distance(p2.x);
        double dy = y.distance(p2.y);
        double dz = z.distance(p2.z);
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    public double distanceToZero() {
        Complex a1 = new Complex(0,0);
        Complex a2 = new Complex(0,0);
        Complex a3 = new Complex(0,0);
        Point p2 = new Point(a1,a2,a3);
        return this.getDistance(p2);
    }

}
