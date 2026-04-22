public class Game {

    // Data Fields
    int id;
    int away_score;
    int home_score;
    double temp;
    Team away;
    Team home;

    // Constructor
    public Game() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAway_score() {
        return away_score;
    }

    public void setAway_score(int away_score) {
        this.away_score = away_score;
    }

    public int getHome_score() {
        return home_score;
    }

    public void setHome_score(int home_score) {
        this.home_score = home_score;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public void print_stats() {
        System.out.println("Game #" + id);
        System.out.println("Temperature: " + (int)temp);
        System.out.println("Away Team: " + away.getName() + ", " + away_score);
        System.out.println("Home Team: " + home.getName() + ", " + home_score);
    }
}