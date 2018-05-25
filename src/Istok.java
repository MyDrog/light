import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Istok {
    Point istochnick = new Point();
    boolean plosk;
    Vector N = new Vector();
    Istok(double x,double y,boolean isplosk)
    {
        plosk = isplosk;
        if(plosk)
        {
            N.set(x,y);
        }
        else
        {
            istochnick.set(x,y);
        }
    }
    TreeMap<Double,Double> getlight(Poverh a)
    {
        TreeMap mmap = new TreeMap<Double,Double>();
        ArrayList<Lych> llist = new ArrayList<Lych>();
        if(plosk) {
            int i = 0;
            //заполняем мап отраженными лучами
            Vector n = new Vector(N.x, N.y);
            n.ymn(1000);
            for (Object qe : a.pov.keySet()) {
                // Vector n = new Vector(N.x,N.y);

                Lych luch = new Lych();
                double q1 = (double) qe;
                double q2 = (double) a.pov.get(qe);
                luch.point.set(q1, q2);
                luch.SetN(n);
                double s = 2 * (a.normal((double) qe).skal(n)) / (a.normal((double) qe).skal(a.normal((double) qe)));
                //if(q1-a.h<a.x0) {
                Vector v = new Vector(a.normal((double) qe).x, a.normal((double) qe).y);
                v.ymn(-s);
                luch.n.add(v);

                llist.add(luch);
            }
        }
        else
        {
            for (Object qe : a.pov.keySet()) {
                 Vector n = new Vector(-istochnick.x + (double)qe,-istochnick.y + (double)a.pov.get(qe));

                Lych luch = new Lych();
                double q1 = (double) qe;
                double q2 = (double) a.pov.get(qe);
                luch.point.set(q1, q2);
                luch.SetN(n);
                double s = 2 * (a.normal((double) qe).skal(n)) / (a.normal((double) qe).skal(a.normal((double) qe)));
                //if(q1-a.h<a.x0) {
                Vector v = new Vector(a.normal((double) qe).x, a.normal((double) qe).y);
                v.ymn(-s);
                luch.n.add(v);

                llist.add(luch);
            }
        }


            //ищу точки пересечени
        for(Lych q0 :llist)
            {
                for(Lych q :llist)
                {
                    if(!q.equals(q0))
                    {
                        Point p = new Point();
                        p = q.peres(q0);
                        if (p.x > a.x0 && p.x < a.x1)
                            mmap.put(p.x,p.y);
                    }
                }

            }



        return  mmap;
    }
}
