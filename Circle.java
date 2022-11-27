import java.util.Scanner;
public class Circle {
    private Segment radius;
    private Point center;
    private Point circle_point;
    public static String name;

    public Circle() {
        center = new Point();
        circle_point = new Point();
        radius = new Segment();
    }

    public Circle(Point center) {
        this.center = center;
        circle_point = new Point();
        radius = new Segment(this.center, circle_point);
    }

    public Circle(Point center, Point circle_point) {
        this.center = center;
        this.circle_point = circle_point;
        radius = new Segment(this.center, this.circle_point);
    }

    public void set_center(Point i) {
        center = i;
    }

    public void set_circle_point(Point j) {
        circle_point = j;
    }

    public void set_radius(Segment r) {
        radius = r;
    }

    public Point get_center() {
        return center;
    }

    public Point get_circle_point() {
        return circle_point;
    }

    public Segment get_radius() {
        return radius;
    }

    public void input() {
        Point center = new Point();
        Point circle_point = new Point();
        System.out.println("Введите координаты центра окружности:");
        center.input();
        System.out.println("Введите координаты точки на окружности:");
        circle_point.input();
        Segment radius = new Segment(center, circle_point);
        this.center = center;
        this.circle_point = circle_point;
        this.radius = radius;
    }

    public void output() {
        Auxiliary Aux = new Auxiliary();
        int c_length;
        circle_length_int(Aux);
        c_length = Aux.parameter;
        System.out.println("Координаты центра окружности: ");
        this.center.output();
        System.out.println("Координаты точки на окружности: ");
        this.circle_point.output();
        System.out.println("Длина радиуса равна " + this.radius.get_length());
        System.out.println("Длина окружности равна " + this.circle_length());
        System.out.println("Длина окружности равна(без дробной части) " + c_length);
        System.out.println("Площадь круга равна " + this.circle_area());
    }

    public double circle_length() {
        double len;
        len = 2 * Math.PI * radius.get_length();
        return len;
    }

    public void circle_length_int(Auxiliary A) {
        A.parameter = (int)(2 * Math.PI * radius.get_length());
    }

    public double circle_area() {
        double area;
        area = Math.PI * Math.pow(radius.get_length(), 2);
        return area;
    }

}
