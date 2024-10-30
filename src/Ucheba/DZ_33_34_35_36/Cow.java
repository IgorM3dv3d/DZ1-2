package Ucheba.DZ_33_34_35_36;

public class Cow extends Mein {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Муууу");
    }

    @Override
    public void eat() {
        System.out.println("Сено");
    }

    @Override
    public void move() {
        System.out.println("на копытах");
    }
}

