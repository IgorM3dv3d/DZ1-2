package Ucheba.DZ_33_34_35_36;

import Ucheba.DZ_20_21.Method;

public class Dog extends Animal {

    public Dog(String dog, String cat, String bird) {
        super(dog, cat, bird);
    }

    public Dog() {
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }
}
