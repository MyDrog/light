import java.util.Map;
import java.util.TreeMap;

public class Poverh {
    double x0 = 0, x1 = 0, h = 0.01;
    TreeMap pov = new TreeMap<Double,Double>();
    void set(double xx0,double xx1)
    {
        x0 = xx0;
        x1 = xx1;
    }
    Vector normal(double tochka){
        if(tochka + h > x1)
        {
            Vector a = new Vector( 1000*((double)pov.get(tochka)-(double)pov.get(tochka-h)),-1000*h);
            return a;
        }
        Vector a = new Vector(1000*((double)pov.get(tochka+h)-(double)pov.get(tochka)),-1000*h);
        return a;
    }


}
