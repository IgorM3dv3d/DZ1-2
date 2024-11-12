package Ucheba.DZ_37_38;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Integer countPlayers = 0;

    private static final int PLAYERS_ON_FIELD = 6;

    private final List<Player> players = new ArrayList<>();


    public void addPlayer(String name) {
        if (countPlayers < PLAYERS_ON_FIELD) {
            countPlayers++;
            Player newPlayer = new Player(this, name);
            players.add(newPlayer);
            System.out.println("Введён новый игрок. Всего игроков: " + countPlayers);
        } else {
            System.out.println("Игроков уже 6. Свободных мест нет!");
        }
    }

    public void info() {
        if (countPlayers < 0) {
            throw new RuntimeException("Количество игроков не может быть отрицательным");
        } else if (countPlayers < PLAYERS_ON_FIELD) {
            System.out.println("Команды неполные. На поле ещё есть  " + (PLAYERS_ON_FIELD - countPlayers) + " мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public List<Player> getPlayer() {
        return players;
    }

    public void checkName(String name) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(name)) {
                System.out.println("Игрок с именем " + name + " есть в списке.");
            } else {
                System.out.println("Игрока с именем " + name + " нет в списке.");
//            break;
            }
        }
    }
}

