package les4.task2;

public class Lorry extends Car {
    int liftingСapacity;

    public Lorry(String model, String carClass, int weight, Engine engine, int liftingСapacity) {
        super(model, carClass, weight, engine);
        this.liftingСapacity = liftingСapacity;
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo() {
        System.out.println("Грузовик. Модель: " + model + ". Класс: " + carClass + ". Вес: " + weight + ". Мощность двигателя: " + engine.power + ". Производительность двигателя: " + engine.performance + ". Грузоподъемность кузова: " + liftingСapacity);
    }
}
