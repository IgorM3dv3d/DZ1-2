package Ucheba.DZ_37_38;

import java.util.Random;


public class Player {
    private int stamina;

    Random r = new Random();

    private final Game game;

    private final String name;

    private final static Integer MAX_STAMINA = 10;

    private final static Integer MIN_STAMINA = 0;

    static private int countPlayer = 0;

    public Player(Game game, String name) {
        this.stamina = r.nextInt(MIN_STAMINA + 6, MAX_STAMINA + 1);
        this.name = name;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayer() {
        return countPlayer;
    }

    public static int getMaxStamina() {
        return MAX_STAMINA;
    }

    public static int getMinStamina() {
        return MIN_STAMINA;
    }

    public void run() {
        if (stamina > 0) {
            stamina--;
            System.out.println(name + " пробежал. " + "Выносливость стала равна: " + stamina);
        } else if (stamina == 0) {
            System.out.println(name + " устал и ушёл отдыхать.");
        }
    }

    public static void info() {
        if (countPlayer < 0) {
            throw new RuntimeException("Кол-во игроков не может быть отрицательным");

        } else if (countPlayer < 6) {
            System.out.println("Команды неполные, " + "есть " + (6 - countPlayer) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name = '" + name + '\'' +
                ", stamina = " + stamina +
                '}';
    }
}
