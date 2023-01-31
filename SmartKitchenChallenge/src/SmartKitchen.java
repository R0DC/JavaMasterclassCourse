public class SmartKitchen{
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        refrigerator = new Refrigerator();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
    }
}

class Refrigerator{
    private boolean hasWorkToDo;

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Cleaning dishes");
            hasWorkToDo = false;
        }
    }
}