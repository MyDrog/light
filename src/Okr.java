import java.util.Map;
import java.util.TreeMap;

public class Okr extends Poverh {
    double R;
    Okr(double xx0,double xx1,double r)
    {
        this.set(xx0,xx1);
        R = r;
        double xx = x0;
        while (xx<x1)
        {
            pov.put(xx,Math.sqrt(R*R-(xx-(x1-x0)/2)*(xx-(x1-x0)/2)));
            xx+=h;
        }
    }
}
