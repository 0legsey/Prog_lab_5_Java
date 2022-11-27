import java.util.Scanner;
public class Triangle {
    private Segment ab;
    private Segment bc;
    private Segment ca;
    private Point a;
    private Point b;
    private Point c;
    public static String name;

    public Triangle() {
        a = new Point();
        b = new Point();
        c = new Point();
        ab = new Segment();
        bc = new Segment();
        ca = new Segment();
    }

    public Triangle(Point a) {
        this.a = a;
        b = new Point(0, 0);
        c = new Point(0, 2);
        ab = new Segment(this.a, b);
        bc = new Segment(b, c);
        ca = new Segment(c, this.a);
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ab = new Segment(this.a, this.b);
        bc = new Segment(this.b, this.c);
        ca = new Segment(this.c, this.a);
    }

    public void set_a(Point i) {
        a = i;
    }

    public void set_b(Point j) {
        b = j;
    }

    public void set_c(Point k) {
        c = k;
    }

    public void set_ab(Segment z) {
        ab = z;
    }

    public void set_bc(Segment x) {
        bc = x;
    }

    public void set_ca(Segment c) {
        ca = c;
    }

    public Point get_a() {
        return a;
    }

    public Point get_b() {
        return b;
    }

    public Point get_c() {
        return c;
    }

    public Segment get_ab() {
        return ab;
    }

    public Segment get_bc() {
        return bc;
    }

    public Segment get_ca() {
        return ca;
    }

    public void input() {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        System.out.println("Введите координаты точки A:");
        a.input();
        System.out.println("Введите координаты точки B:");
        b.input();
        System.out.println("Введите координаты точки C:");
        c.input();
        Segment ab = new Segment(a, b);
        Segment bc = new Segment(b, c);
        Segment ca = new Segment(c, a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    public void output() {
        System.out.println("Координаты точки A: ");
        this.a.output();
        System.out.println("Координаты точки B: ");
        this.b.output();
        System.out.println("Координаты точки C: ");
        this.c.output();
        System.out.println("Длина отрезка AB равна " + this.ab.get_length());
        System.out.println("Длина отрезка BC равна " + this.bc.get_length());
        System.out.println("Длина отрезка CA равна " + this.ca.get_length());
        System.out.println("Периметр треугольнака равен " + this.triangle_perimeter());
        System.out.println("Площадь треугольника равна " + this.triangle_area());
    }

    public double triangle_perimeter() {
        double perimeter;
        perimeter = ab.get_length() + bc.get_length() + ca.get_length();
        return perimeter;
    }

    public double triangle_area() {
        double area;
        double half_perimeter = triangle_perimeter() / 2;
        area = Math.sqrt(half_perimeter * (half_perimeter - ab.get_length()) * (half_perimeter - bc.get_length()) * (half_perimeter - ca.get_length()));
        return area;
    }

}
