package les4.task1;

public class Circle implements Shape{
    double radius;

    public Circle() {
        radius = 5;
    }

    @Override
    public double square() {
        return 2 * 3.14 * radius;
    }
}
