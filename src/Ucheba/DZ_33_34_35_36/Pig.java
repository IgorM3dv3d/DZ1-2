package Ucheba.DZ_33_34_35_36;

public class Pig extends Mein {
    public Pig(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Хрю-хрю");
    }

    @Override
    public void eat() {
        System.out.println("Фураж");
    }

    @Override
    public void move() {
        System.out.println("на копытах");
    }
}
