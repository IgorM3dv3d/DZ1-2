package Ucheba.DZ_33_34_35_36;

public class Wolf extends Mein {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Рррррр");
    }

    @Override
    public void eat() {
        System.out.println("мясо");
    }

    @Override
    public void move() {
        System.out.println("на лапах");
    }
}
