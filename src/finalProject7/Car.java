package finalProject7;

public class Car extends Vehicule {
    private CarType type;

    public Car(String brand, String model, int year ,CarType type) {
        super(brand, model, year);
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("El auto Arranco");
    }

    @Override
    public String toString() {
        return super.toString() + "type=" + type;

    }
}
