package Ucheba.DZ_33_34_35_36;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println("Кость");
    }
}
