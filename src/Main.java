import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Team t1 = new Team("Ajax", "Amsterdam");
        Team t2 = new Team("PSV", "Eindhoven");

        Player p1 = new Player("Leo Messi", 10_000_000, 'm');

        Player p2 = new Player("Lieke Martens", 20_000_000, 'f');

        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.showPlayers();

        Game game1 = new Game(t1, t2);
        game1.addGoal(true);
        game1.addGoal(false);
        game1.addGoal(true);
        game1.addGoal(true);
        game1.print();


    }
}
