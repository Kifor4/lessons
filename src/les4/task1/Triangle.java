package les4.task1;

public class Triangle implements Shape {
    double a, b, c;

    public Triangle () {
        a = 6;
        b = 5;
        c = 4;
    }

    @Override
    public double square() {
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
