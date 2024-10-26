package Ucheba.DZ_33_34_35_36;

public class Cow extends Animal {
    public Cow() {}

    @Override
    public void makeSound () {
        String name = "Корова";
        System.out.println( name + ": " + "Мууууу");
    }
}

