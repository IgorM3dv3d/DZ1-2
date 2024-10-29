package Ucheba.DZ_33_34_35_36;

public class Dog extends Animal implements Pet {
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

    @Override
    public void move() {
        System.out.println("на лапах");
    }

    @Override
    public void play() {
        System.out.println("Бегает за палкой");
    }

    @Override
    public void beFriendly() {
        System.out.println("Энергично виляет хвостом");
    }
}
