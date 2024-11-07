package Ucheba.DZ_37_38;

public class Player {
    private int stamina = 9;

    private final static int MAX_STAMINA = 10;

    private final static int MIN_STAMINA = 0;

    static private int countPlayer = 0;

    public Player(String name) {
        countPlayer++;
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
            System.out.println("игрок пробежал. " + "Выносливость равна " + stamina);
        } else {
            System.out.println("игрок устал");
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
}
