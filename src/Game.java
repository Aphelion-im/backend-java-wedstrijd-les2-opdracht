public class Game {

    Team thuisTeam;
    Team uitTeam;
    int goalsThuisTeam;
    int goalsUitTeam;

    public Game(Team thuisTeam, Team uitTeam) {
        this.thuisTeam = thuisTeam;
        this.uitTeam = uitTeam;
    }

    public void addGoal(boolean isHomeTeamGoal) {
        if (isHomeTeamGoal) {
            goalsThuisTeam++;
        } else {
            goalsUitTeam++;
        }
    }

    public void print() {
        System.out.println(thuisTeam.name + " tegen " + uitTeam.name + ": " + goalsThuisTeam + "-" + goalsUitTeam);
    }

}
