package Ucheba.DZ_33_34_35_36;

public class Animal {
    String dog;
    String cat;
    String bird;


    public Animal(String dog, String cat, String bird) {
        this.dog = dog;
        this.cat = cat;
        this.bird = bird;
    }

    public Animal() {
    }

    void makeSound() {
        System.out.println("Животное издает звук: ");
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Bird();


        Animal[] animals = {animal1, animal2, animal3};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
