public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    public void drive(){
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up!%n", cylinders);
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterSize;
    public ElectricCar(String description, double avgKmPerCharge, int batterSize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterSize = batterSize;
    }

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        System.out.printf("EV -> switch %d kWh battery on%n", batterSize);
    }

    @Override
    public void drive() {
        System.out.printf("EV -> usage under %.2f%n", avgKmPerCharge);
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up%n", cylinders);
        System.out.printf("Hybrid -> %d kWh battery switched on%n", batterySize);
    }

    @Override
    public void drive() {
        System.out.printf("Hybrid -> usage below %.2f%n", avgKmPerLitre);
    }
}

