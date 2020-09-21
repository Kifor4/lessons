package les4.task2;

public abstract class Car {
    String model, carClass;
    int weight;
    Engine engine;

    public Car(String model, String carClass, int weight, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    abstract void start();
    abstract void stop();
    abstract void printInfo();

    void turnRight() {
        System.out.println("Поворт направо");
    }

    void turnLeft() {
        System.out.println("Поворт налево");
    }
}
