
public class Vector {
    double x, y,ygol;
    Vector()
    {
        x = 1;
        y = 0;
    }
    Vector(double xx,double yy)
    {
        x=xx;
        y=yy;
        ygol = ygol();
    }
    Vector(double yy)
    {
        ygol = yy;
    }
    void set(double xx,double yy)
    {
       x=xx;
       y=yy;
    }
    void setYgol(double yy)
    {
        ygol = yy;
    }
    double ygol()
    {
        return Math.atan(y/x);
    }
//скалярное пр
    double skal(Vector oth)
    {
        return oth.x * x + oth.y * y;
    }
    //сложение векторов
    void add(Vector oth)
    {
        x+= oth.x;
        y+= oth.y;
    }
    void ymn(double a){
       // System.out.println("a = "+a);
        x= x*a;
        y=y* a;
    }
}