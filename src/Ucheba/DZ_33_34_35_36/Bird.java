package Ucheba.DZ_33_34_35_36;

public class Bird extends Animal {
    private boolean canFly;


    public Bird(String dog, String cat, String bird) {
        super(dog, cat, bird);
    }

    public Bird() {
        super();
        this.canFly = canFly;
    }


    @Override
    public void makeSound(){
        String name = "Птица";
        System.out.println( name + ": " + "Чик-чирик");
    }

    public void eat(){
        System.out.println("Птица ест семена");
    }
}

