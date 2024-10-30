package Ucheba.DZ_33_34_35_36;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public abstract void eat();

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Собака ");
        Animal cat = new Cat("Кошка ");
        Animal bird = new Bird("Птица ", true);

        Animal[] animals = {dog, cat, bird};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + "издает звук: ");
            animal.makeSound();
            System.out.println(animal.getName() + "ест: ");
            animal.eat();
            System.out.println(animal.getName() + "двигается");
            animal.move();
        }
        if (dog instanceof Pet) {
            System.out.println(dog.getName() + ": " + "домашнее животное");
        } else {
            System.out.println(dog.getName() + ": " + "не домашнее животное");
        }
            System.out.println(dog.getName() + ":");
            ((Pet) dog).play();
            ((Pet) dog).beFriendly();

        if (cat instanceof Pet) {
            System.out.println(cat.getName() + ": " + "домашнее животное");
        } else {
            System.out.println(cat.getName() + ": " + "не домашнее животное");
        }
            System.out.println(cat.getName() + ":");
            ((Pet) cat).play();
            ((Pet) cat).beFriendly();

        if (bird instanceof Pet) {
            System.out.println(bird.getName() + "домашнее животное");
        } else {
            System.out.println(bird.getName() + ": " + "не домашнее животное");
        }
    }
}

