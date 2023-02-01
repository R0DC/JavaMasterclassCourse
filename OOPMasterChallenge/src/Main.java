public class Main {
    public static void main(String[] args) {
//My attempt inputs
        //        Meal regularMeal = new Meal();
//        regularMeal.itemizedList();
//        regularMeal.totalSum();

//        Burger cheeseburger = new Burger("cheeseburger");
//        cheeseburger.addTopping("pickles");
//        cheeseburger.addTopping("onions");
//        cheeseburger.addTopping("lettuce");
//        cheeseburger.addTopping("pickles");
//
//        Drink sprite = new Drink("sprite", "large");
//        SideItem coleslaw = new SideItem("coleslaw");
//
//        Meal newMeal = new Meal(cheeseburger,sprite,coleslaw);
//        newMeal.totalSum();
//        newMeal.itemizedList();

        //TB sol
//        Burger_TB burgerTB = new Burger_TB("regular", 4.00);
//        burgerTB.addToppings("BACON","CHEESE","MAYO");
//        burgerTB.printItem();

//        MealOrderTB mealOrderTB = new MealOrderTB();
//        mealOrderTB.addBurgerToppings("BACON","CHEESE","MAYO");
//        mealOrderTB.setDrinkSize("LARGE");
//        mealOrderTB.printItemizedList();

        MealOrderTB secondMeal = new MealOrderTB("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}
