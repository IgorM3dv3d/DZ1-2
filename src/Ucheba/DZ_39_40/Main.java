package Ucheba.DZ_39_40;

public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .floors(2)
                .rooms(5)
                .garage(1)
                .build();

        System.out.println(house1);

        House house2 = new House.Builder()
                .floors(1)
                .rooms(2)
                .garage(0)
                .build();

        System.out.println(house2);
    }
}
