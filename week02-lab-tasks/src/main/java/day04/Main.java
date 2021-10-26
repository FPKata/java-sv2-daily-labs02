package day04;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(380);

        System.out.println("Price of refuelling: " + gasStation.refuelCar(car, 40));
        car.setKm(600);
        System.out.println("Use of gasoline per 100 km: " + Math.round(car.calculateGasolineUsage()));
    }
}
