package Ucheba.DZ_33_34_35_36;

public class Cat extends Animal implements Pet {
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

    @Override
    public void move() {
        System.out.println("грациозно");
    }

    @Override
    public void play() {
        System.out.println("Играет с лазерной указкой");
    }

    @Override
    public void beFriendly() {
        System.out.println("Мурлыкает");
    }
}
