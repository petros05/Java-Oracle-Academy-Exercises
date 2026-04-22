public class Main {
    public static void main(String[] args) {
        // Create league
        League league = new League();
        
        // Create 4 teams
        Team team1 = new Team("1");
        Team team2 = new Team("2");
        Team team3 = new Team("3");
        Team team4 = new Team("4");

        // Add teams to league
        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam(team3);
        league.addTeam(team4);

        // Create scheduler and run season
        Scheduler scheduler = new Scheduler(league);
        scheduler.runSeason();
    }
}