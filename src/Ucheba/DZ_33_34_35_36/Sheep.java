package Ucheba.DZ_33_34_35_36;

public class Sheep extends Animal {
    public Sheep() {}


    @Override
    public void makeSound(){
        String name = "Овца";
        System.out.println( name + ": " + "Бееее");
    }
}
