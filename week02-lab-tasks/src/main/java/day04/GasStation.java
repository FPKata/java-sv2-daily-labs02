package day04;

public class GasStation {
    private int price;

    public GasStation(int price){
        this.price = price;
    }

    public double refuelCar(Car car, double literOfGasoline){
        car.setLiterOfGasoline(literOfGasoline);
        return literOfGasoline * price;
    }


}
