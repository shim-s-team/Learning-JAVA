public class PointTest
{
    public static void main(String[] args)
    {
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        p.PointXY();
    }
}

class Point
{
    int x;
    int y;

    public void PointXY() { System.out.println("x = " + x + ", y = " + y); }
}