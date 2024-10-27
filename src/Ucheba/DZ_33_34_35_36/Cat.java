package Ucheba.DZ_33_34_35_36;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Рыбу");
    }
}
