package finalProject7;

public class Main {
    public static void main(String[] args) {
        Vehicule myCar = new Car("honda","Civic",2020,CarType.SPORTS);
        Vehicule electricCar = new ElectricCar("tesla","one",2020,CarType.SENDA, 80);

        myCar.start();
        electricCar.start();
        ((ElectricCar)electricCar).chargerBattery();

        System.out.println(electricCar);
        System.out.println(myCar);

    }
}
