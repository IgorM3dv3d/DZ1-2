package Ucheba.DZ_33_34_35_36;

public class Pig extends Animal{
    public Pig(){}

    @Override
    public void makeSound(){
        String name = "Свинья";
        System.out.println( name + ": " + "Хрю-хрю");
    }
}
