public class Main extends Object {
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

//        for (int i = 1; i <= 5; i++){
//            LPAStudent s = new LPAStudent("S958" + i,
//                    switch (i) {
//                case 1 -> "Mary";
//                case 2 -> "Carol";
//                case 3 -> "Tom";
//                case 4 -> "Harry";
//                case 5 -> "Lisa";
//                default -> "Anonymous";
//            }, "05/11/2000", "JavaMaster");
//            System.out.println(s);
//
//            Student pojoStudent = new Student("S86958", "Ann", "05/11/2020", "JavaMasterclass");
//            LPAStudent recordStudent = new LPAStudent("S84615", "Jim", "05/11/2020", "JavaMasterclass");
//
//            System.out.println(pojoStudent);
//            System.out.println(recordStudent);
//
//            pojoStudent.setClassList(pojoStudent.getClassList() + ", JAVA OCP Exam 829");
//
//            System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
//            System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
//        }

//        Animal animal = new Animal("Generic Animal", "Huge", 400);
//        doAnimalStuff(animal, "slow");
//
//        Dog dog = new Dog();
//        doAnimalStuff(dog, "fast");
//
//        Dog yorkie = new Dog("Yorkie", 15);
//        doAnimalStuff(yorkie,"fast");
//
//        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
//        doAnimalStuff(retriever, "slow");
//
//        Dog wolf = new Dog("Wolf", 40);
//        doAnimalStuff(wolf, "slow");
//
//        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
//        doAnimalStuff(goldie, "fast");

        Student2 max = new Student2("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }

//    public static void doAnimalStuff(Animal animal, String speed){
//        animal.makeNoise();
//        animal.move(speed);
//        System.out.println(animal);
//        System.out.println("____");
//    }
}

class Student2 {
    private String name;
    private int age;
    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
//        return "Student2{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student2 {
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
