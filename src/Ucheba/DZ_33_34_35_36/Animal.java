package Ucheba.DZ_33_34_35_36;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void makeSound() {
    }

    void eat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name + "]";
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Собака");
        Animal cat = new Cat("Кошка");
        Animal bird = new Bird("Птица", true);

        Animal[] animals = {dog, cat, bird};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " издает звук: ");
            animal.makeSound();
            System.out.println(animal.getName() + " ест: ");
            animal.eat();
        }
    }
}
