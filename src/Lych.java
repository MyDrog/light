public class Lych {
    Vector n = new Vector();
    Point point = new Point();

    void SetN(Vector nn) {
        n.x = nn.x;
        n.y = nn.y;
    }

    void SetPoint(Point a)
    {
        point = a;
    }
    //точка перечечения
    Point peres(Lych oth)
    {
        Point per = new Point();
        per.x = ((oth.n.x / oth.n.y)*(point.y -  (n.y/n.x)*point.x-oth.point.y))/(1-(oth.n.x / oth.n.y)*(n.y/n.x));
        per.y = (n.y/n.x)*(per.x - point.x)+point.y;
        return per;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
