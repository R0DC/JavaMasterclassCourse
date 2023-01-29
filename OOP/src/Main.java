public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setMake("Porsche");
//        car.setModel("Carrera");
//        car.setColor("Red");
//        car.setDoors(2);
//        car.setConvertible(true);
//
//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());
//
//        car.describeCar();

//        BankAccount acc = new BankAccount(124545, 20000.0,
//                "Bob", "bob@mail.com", "7654826559");

//        BankAccount acc2 = new BankAccount("Homie","homie@mail","45617865");
//
//        System.out.println(acc2.getAccountBalance());
//        System.out.println(acc2.getEmail());

//        Customer cus1 = new Customer();
//        Customer cus2 = new Customer("John", 15432.33, "john@gmail");
//        Customer cus3 = new Customer("Ken", "ken@mail");
//
//        System.out.println(cus1.getCreditLimit() + " " + cus1.getName() + " " + cus1.getEmailAddress());
//        System.out.println(cus2.getCreditLimit() + " " + cus2.getName() + " " + cus2.getEmailAddress());
//        System.out.println(cus3.getCreditLimit() + " " + cus3.getName() + " " + cus3.getEmailAddress());

        for (int i = 1; i <= 5; i++){
            Student s = new Student("S958" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tom";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            }, "05/11/2000", "JavaMaster");
            System.out.println(s);

        }

    }


}
