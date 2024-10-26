package Ucheba.DZ_33_34_35_36;

public class Cat extends Animal {
    public Cat(String dog, String cat, String bird) {
        super(dog, cat, bird);
    }

    public Cat() {}

    @Override
    public void makeSound(){
        String name = "Кошка";
        System.out.println( name + ": " + "Мяу");
    }
    public void eat(){
        System.out.println("Кошка ест рыбу");
    }
}
