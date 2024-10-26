package Ucheba.DZ_33_34_35_36;

public class Cat extends Animal {
    public Cat(String dog, String cat, String bird) {
        super(dog, cat, bird);
    }

    public Cat() {}

    @Override
    public void makeSound(){
        System.out.println("Мяу");
    }
}
