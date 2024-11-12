package Ucheba.DZ_37_38;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.getPlayer());
        game.info();

        game.addPlayer("Alexei");
        game.checkName("Alexei");

        game.addPlayer("Bob");
        game.checkName("Bob");

        game.addPlayer("Jack");

        game.checkName("Denis");
        System.out.println(game.getPlayer());

        game.addPlayer("Ivan");
        game.addPlayer("George");
        game.addPlayer("Sasha");

        System.out.println(game.getPlayer());

        game.addPlayer("Michael");

        game.info();

        for (int i = 0; i < Player.getMaxStamina(); i++) {
            if (game.getPlayer().get(4).getStamina() >= 0) {
                game.getPlayer().get(4).run();
            } else {
                break;
            }
        }

        for (int i = 0; i < Player.getMaxStamina(); i++) {
            if (game.getPlayer().get(2).getStamina() >= 0) {
                game.getPlayer().get(2).run();
            } else {
                break;
            }
        }

        for (int i = 0; i < Player.getMaxStamina(); i++) {
            if (game.getPlayer().get(1).getStamina() >= 0) {
                game.getPlayer().get(1).run();
            } else {
                break;
            }
        }
    }
}
