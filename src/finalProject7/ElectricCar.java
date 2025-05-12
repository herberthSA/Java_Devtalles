package finalProject7;

public class ElectricCar extends Car implements Electric {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("El carro eléctrico esta encendido....");
    }

    @Override
    public void chargerBattery() {
        batteryLevel = 100;
        System.out.println("La bateria esta al 100%");
    }

    @Override
    public String toString() {
        return super.toString()+ "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
