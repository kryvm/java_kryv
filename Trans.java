package hw9;

import java.util.Arrays;
import java.util.LinkedList;

public class Trans {
    float[] routes;

    class Info{
        LinkedList<Object[]> inf;
        Info(){
            inf = new LinkedList<>();
        }
        public void addRoute(Route r){
            inf.add(new Object[3]);
            inf.getLast()[0] = r.price;
            inf.getLast()[1] = r.interval;
            inf.getLast()[2] = r.route;
        }

        @Override
        public String toString() {
            String res = "";
            for(Object[] i : inf)
                res += "Route number " + i[2] + " Price is " + i[0] + " Interval is " + i[1] + "\n";
            return res;
        }


    }

    Info info;

    public void addR(Route r){
        int n = this.routes.length;
        float[] tmp = Arrays.copyOf(this.routes, n);
        this.routes = new float[n + 1];
        System.arraycopy(tmp, 0, this.routes, 0, n);
        this.routes[n] = r.route;
        info.addRoute(r);
    }

}
