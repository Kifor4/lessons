package les4.task2;

public class Task2 {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("Камаз", "C", 8000, new Engine(260, 360), 13000);
        SportCar sportCar = new SportCar("Aventador", "H", 1575, new Engine(700, 515), 350);
        lorry.printInfo();
        lorry.start();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.stop();
        sportCar.printInfo();
        sportCar.start();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.stop();
    }
}
