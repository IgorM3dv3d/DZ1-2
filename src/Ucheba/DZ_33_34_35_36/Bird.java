package Ucheba.DZ_33_34_35_36;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Чик-чирик");
    }

    public String toString() {
        return super.toString() + ", canFly=" + canFly;
    }

    @Override
    public void eat() {
        System.out.println("Семена");
    }
}

