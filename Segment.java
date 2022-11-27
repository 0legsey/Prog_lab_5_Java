import java.util.Scanner;
public class Segment {
    private double length;
    private Point a;
    private Point b;
    public static Point a1;
    public static Point b1;
    public static String name;

    public Segment() {
        a = new Point();
        b = new Point();
        length = 0;
    }

    public Segment(Point a) {
        this.a = a;
        b = new Point();
        length = length_calc();
    }

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
        length = length_calc();
    }

    public void set_a(Point i) {
        a = i;
    }

    public void set_b(Point j) {
        b = j;
    }

    public void set_length(double l) {
        length = l;
    }

    public Point get_a() {
        return a;
    }

    public Point get_b() {
        return b;
    }

    public double get_length() {
        return length;
    }

    public void input() {
        Point a = new Point();
        Point b = new Point();
        System.out.println("Введите координаты первой точки:");
        a.input();
        System.out.println("Введите координаты второй точки:");
        b.input();
        this.a = a;
        this.b = b;
        this.length = length_calc();
    }

    public void output() {
        System.out.println("Координаты первой точки: ");
        this.a.output();
        System.out.println("Координаты второй точки: ");
        this.b.output();
        System.out.println("Длина отрезка равна " + this.length);
    }

    public double length_calc() {
        double len;
        len = Math.pow(a.get_x() - b.get_x(), 2) + Math.pow(a.get_y() - b.get_y(), 2);
        return Math.sqrt(len);
    }

    public static double degrees_calc(Segment s){
        Segment s1 = new Segment(a1, b1);
        double cos;
        double degrees;
        cos = ((a1.get_x() - b1.get_x()) * (s.a.get_x() - s.b.get_x()) + (a1.get_y() - b1.get_y()) * (s.a.get_y() - s.b.get_y())) / (s.get_length() * s1.get_length());
        degrees = Math.toDegrees(Math.acos(cos));
        return degrees;
    }
}
