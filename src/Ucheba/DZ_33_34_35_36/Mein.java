package Ucheba.DZ_33_34_35_36;

public abstract class Mein {
    private String name;

    public Mein(String name) {
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
        Mein cow = new Cow("Корова ");
        Mein pig = new Pig("Свинья ");
        Mein wolf = new Wolf("Волк ");

        Mein[] animals = {cow, pig, wolf};

        for (Mein animal : animals) {
            System.out.println(animal.getName() + "издает звук:");
            animal.makeSound();
            System.out.println(animal.getName() + "ест:");
            animal.eat();
            System.out.println(animal.getName() + "передвигается");
            animal.move();
        }

        if (cow instanceof Pet) {
            System.out.println(cow.getName() + ": " + "домашнее животное");
        } else {
            System.out.println(cow.getName() + ": " + "не домашнее животное");
        }
        if (pig instanceof Pet) {
            System.out.println(pig.getName() + ": " + "домашнее животное");
        } else {
            System.out.println(pig.getName() + ": " + "не домашнее животное");
        }
        if (wolf instanceof Pet) {
            System.out.println(wolf.getName() + ": " + "домашнее животное");
        } else {
            System.out.println(wolf.getName() + ": " + "не домашнее животное");
        }
    }
}
