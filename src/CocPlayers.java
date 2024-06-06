import java.util.Arrays;

public class CocPlayers {
    public static void main(String[] args) {
 Player p1 = new Player  ("Paul", 3);
 Team t1 = new Team(11,"Stars");
        Player p2 = new Player  ("Paul", 10);
        Player p3 = new Player  ("Paul", 30);
        Player p4 = new Player  ("Paul", 5);
        //p2.getScore();
        p2.incrementScore(p1, 5);
        t1.addPlayersToTeam(new Player("Stef", 2));
        t1.addPlayersToTeam(new Player("Gran", 23));
        t1.addPlayersToTeam(new Player("Gab", 26));
        t1.getHighScore(t1.getPlayers());

    }
}
class Team {
    private Player[] players;
    private int n0Players;
    private String teamName;

    public Team(int n0Players, String teamName) {
        this.n0Players = n0Players;
        this.teamName = teamName;

    }

    public void addPlayersToTeam(Player player) {
        //create new list with added length
        //list is empyt
        if (players == null) {
            players = new Player[1]; //declaire list of players with 1 element
            //Player[] newPlayers = new Player[1];
            //add the player
            players[0] = player;
        } else {
            Player[] newPlayers = Arrays.copyOf(players, players.length + 1);
            //add new player to end of list
            newPlayers[players.length] = player;
            players = newPlayers;
        }
    }

    public int getHighScore(Player[] players) {
        int tempscore = 0;
        String name = "";
        if (players.length == 0) {
            System.out.println("no players");
        } else {
            //System.out.println(players.length);
            for (int i = 0; i < players.length; i++) {
                if (players[i].getScore() >= tempscore) {
                    tempscore = players[i].getScore();
                   // System.out.println("ts = " + tempscore);
                    name = players[i].getName();
                }
             }
            System.out.println("Player highscore : " + "name " +name+ " " +tempscore);
        }

        return tempscore;
    }


    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getN0Players() {
        return n0Players;
    }

    public void setN0Players(int n0Players) {
        this.n0Players = n0Players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
class Player{
    private String name;
    private int score;

    public Player(String name, int score) {

        this.name = name;
        this.score = score;
    }
    public void incrementScore(Player player, int n0Goals){
        score += n0Goals;
        System.out.println("Goal score for Player + "
                +player.getName()
               +" is : "+ player.getScore()+n0Goals);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

