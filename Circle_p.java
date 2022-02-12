public class Circle_p extends Shape{
    public Circle_p(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return PI * (dim1 * dim2);
    }
    
}
