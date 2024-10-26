package Ucheba.DZ_33_34_35_36;

public class Main {
    String Cow;
    String Pig;
    String Sheep;


    public Main(String cow, String pig, String sheep) {
        Cow = cow;
        Pig = pig;
        Sheep = sheep;
    }

    public Main(){
    }

    void makeSound(){
        System.out.println("Животное издает звук: ");
    }

    public String getCow() {
        return Cow;
    }

    public void setCow(String cow) {
        Cow = cow;
    }

    public String getPig() {
        return Pig;
    }

    public void setPig(String pig) {
        Pig = pig;
    }

    public String getSheep() {
        return Sheep;
    }

    public void setSheep(String sheep) {
        Sheep = sheep;
    }

    public static void main(String[] args) {
        Animal animal4 = new Cow();
        Animal animal5 = new Pig();
        Animal animal6 = new Sheep();

        Animal[] animals = {animal4, animal5, animal6};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
