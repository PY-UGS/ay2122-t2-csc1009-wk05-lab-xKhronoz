public class Polymorphism {
    public static void main(String[] args) {
        Rectangle_p r = new Rectangle_p(9, 5);
        Triangle_p t = new Triangle_p(10, 8);
        Circle_p c = new Circle_p(5,5);
        Ellipse_p e = new Ellipse_p(7,7);
        Square_p s = new Square_p(6,6);
        Shape figref;
        figref = r;
        System.out.println("Area for Rectangle");
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area for Triangle");
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area for Circle");
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area for Ellipse");
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area for Square");
        System.out.println("Area is " + figref.area());
    }
}
