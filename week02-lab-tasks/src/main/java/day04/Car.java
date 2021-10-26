package day04;

public class Car {

    private double km;
    private double literOfGasoline;

    public void setLiterOfGasoline(double literOfGasoline){
        this.literOfGasoline = literOfGasoline;
    }

    public double getLiterOfGasoline(){
        return literOfGasoline;
    }

    public void setKm(double km){
        this.km = km;
    }

    public double getKm(){
        return km;
    }

    public double calculateGasolineUsage(){
        return (literOfGasoline / km) * 100;
    }
}
