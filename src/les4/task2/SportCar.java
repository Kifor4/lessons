package les4.task2;

public class SportCar extends Car {
    int maxSpeed;

    public SportCar(String model, String carClass, int weight, Engine engine, int maxSpeed) {
        super(model, carClass, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void start() {
        System.out.println("SportCar поехад");
    }

    @Override
    void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    void printInfo() {
        System.out.println("SportCar. Модель: " + model + ". Класс: " + carClass + ". Вес: " + weight + ". Мощность двигателя: " + engine.power + ". Производительность двигателя: " + engine.performance + ". Предельная скорость: " + maxSpeed);
    }
}
