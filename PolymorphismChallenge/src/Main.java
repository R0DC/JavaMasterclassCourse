public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Ferrari");
//        runRace(car);

//        Car ferrari = new GasPoweredCar("Ferrari", 20, 8);
//        runRace(ferrari);

        Car tesla = new ElectricCar("Tesla",568,75);
        runRace(tesla);

        Car hybrid = new HybridCar("Hybrid Ferrari", 16, 8, 8);
        runRace(hybrid);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
