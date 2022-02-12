public class Rectangle_p extends Shape {

    public Rectangle_p(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return dim1 * dim2;
    }

}
