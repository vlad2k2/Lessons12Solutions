package app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Машина працює");
    }

    private void startElectricity() {
        System.out.println("Подача живлення");
    }

    private void startCommand() {
        System.out.println("Старт двигуна");
    }

    private void startFuelSystem() {
        System.out.println("Перевірка системи");
    }

}
