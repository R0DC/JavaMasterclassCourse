public class MealOrderTB {
    private BurgerTB burgerTb;
    private Item drink;
    private Item side;

    public MealOrderTB(){
        this("regular","coke","fries");
    }

    public MealOrderTB(String burgerType, String drinkType, String sideType){
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burgerTb = new DeluxeBurgerTB(burgerType, 8.5);
        } else {
            this.burgerTb = new BurgerTB(burgerType, 4.0);
        }
            this.drink = new Item("drink", drinkType, 1.00);
            this.side = new Item("side", sideType, 1.5);
    }

    public double getTotalPrice(){
        if(burgerTb instanceof DeluxeBurgerTB){
            return  burgerTb.getAdjustedPrice();
        }

        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burgerTb.getAdjustedPrice();
    }

    public void printItemizedList() {
        burgerTb.printItem();
        if (burgerTb instanceof DeluxeBurgerTB) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burgerTb.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5){
        if(burgerTb instanceof DeluxeBurgerTB db){
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burgerTb.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
