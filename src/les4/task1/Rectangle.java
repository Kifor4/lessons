package les4.task1;

public class Rectangle implements Shape {
    double a, b;

    public Rectangle() {
        a = 5;
        b = 6;
    }

    @Override
    public double square() {
        return a * b;
    }
}
