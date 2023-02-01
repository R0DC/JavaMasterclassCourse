public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Meal() {
        this(new Burger(), new Drink(), new SideItem());
    }

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void itemizedList(){
        System.out.println("Your order: " + burger.getType() + " with" +
                burger.getToppingsOnBurger() + " with a " + drink.getSize() + " " +
                drink.getType() + " and a side of " + sideItem.getType());
    }

    public void totalSum(){
        double total = burger.getPrice() + drink.getPrice() + sideItem.getPrice();
        System.out.printf("Your total is: %.2f%n", total);
    }
}

class Burger{
    private String type;
    private double price;
    private int toppingsAmount;
    private String toppingsOnBurger;

    public Burger(String type) {
        this.type = type;
        switch (type.toLowerCase()){
            case "cheeseburger" -> this.price = 5.99;
            case "big mac" -> this.price = 8.99;
            case "quarterpounder" -> this.price = 10.99;
            default -> this.price = 4.99;
        }
        toppingsAmount = 0;
        toppingsOnBurger = "";
    }

    public Burger(){
        this("regular");
    }

    public void addTopping(String toppingChoice){
        if (toppingsAmount >= 3){
            System.out.println("Can't add more toppings");
            return;
        }

        if(toppingChoice.isEmpty()){
            return;
        } else {
            toppingsAmount++;
            Topping topping = new Topping(toppingChoice);
            price += topping.getPrice();
            toppingsOnBurger = toppingsOnBurger + ", " + topping.getDescription();
        }
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getToppingsOnBurger() {
        return toppingsOnBurger;
    }
}

class Topping{
    private String description;
    private double price;

    public Topping(String description) {
        this.description = description;
        switch(description.toLowerCase()){
            case "pickles" -> price = 0.99;
            case "lettuce" -> price = 0.59;
            case "onions" -> price = 0.29;
            default -> price = 0;
        };
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }
}

class Drink{
    private String type;
    private double price;
    private String size;

    public Drink() {
        this("Coke", "small");
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        switch(size.toLowerCase()){
            case "large" -> price = 1.59;
            case "medium" -> price = 1.29;
            default -> price = 0.99;
        }
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}

class SideItem{
    private String type;
    private double price;

    public SideItem() {
        this("");
    }

    public SideItem(String type) {
        this.type = type;
        switch(type.toLowerCase()){
            case "fries" -> price = 0.99;
            case "coleslaw" -> price = 0.79;
            default -> price = 0;
        }
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

//class DeluxeBurger extends Burger{
//    private double price;
//    private int toppingsAmount;
//    public DeluxeBurger() {
//        price = 10.99;
//        toppingsAmount = 0;
//    }
//
//    @Override
//    public void addTopping(String toppingChoice) {
//        if (toppingsAmount >= 5){
//            System.out.println("Can't add more toppings");
//            return;
//        }
//
//        if(toppingChoice.isEmpty()){
//            return;
//        } else {
//            toppingsAmount++;
//            Topping topping = new Topping(toppingChoice);
//            price += topping.getPrice();
//            toppingsOnBurger = toppingsOnBurger + ", " + topping.getDescription();
//        }
//    }
//
//    @Override
//    public double getPrice() {
//        return price;
//    }
//}