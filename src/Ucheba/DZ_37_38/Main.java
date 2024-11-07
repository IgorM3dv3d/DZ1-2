package Ucheba.DZ_37_38;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Alexei");
        Player player2 = new Player("Bob");
        Player player3 = new Player("Jack");
        Player player4 = new Player("Ivan");
        Player player5 = new Player("George");
        Player player6 = new Player("Sasha");

        for (int i = 0; i < Player.getMaxStamina(); i++) {
            if (Player.getMinStamina() >= 0) {
                player1.run();
            } else {
                break;
            }
            System.out.println();
        }

        System.out.println("Количество игроков на поле: " + Player.getCountPlayer());
        Player.info();
    }
}
