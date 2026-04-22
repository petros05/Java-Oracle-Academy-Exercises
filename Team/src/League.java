import java.util.ArrayList;
import java.util.Random;

public class League {
    private ArrayList<Team> teams;
    private ArrayList<Game> games;
    private Random random;
    private int gameId;
    private double hottest_temp;
    private double total_temps;
    private int temp_count;
    private int freezing_weeks;

    // Constructor
    public League() {
        teams = new ArrayList<>();
        games = new ArrayList<>();
        random = new Random();
        gameId = 1;
        hottest_temp = Double.NEGATIVE_INFINITY;
        total_temps = 0;
        temp_count = 0;
        freezing_weeks = 0;
    }

    // Add team to league
    public void addTeam(Team team) {
        teams.add(team);
    }

    // Play a game between two teams
    public void playGame(Team away, Team home, double temperature) {
        Game game = new Game();
        game.setId(gameId++);
        game.setAway(away);
        game.setHome(home);
        game.setTemp(temperature);

        // Track temperature
        if (temperature > hottest_temp) {
            hottest_temp = temperature;
        }
        total_temps += temperature;
        temp_count++;

        // Determine goals based on temperature
        // Lower temp = fewer goals, higher temp = more goals
        int maxGoalsAway = 5;
        int maxGoalsHome = 5;

        if (temperature < 40) {
            maxGoalsAway = 2;
            maxGoalsHome = 2;
        } else if (temperature < 60) {
            maxGoalsAway = 3;
            maxGoalsHome = 3;
        } else {
            maxGoalsAway = 5;
            maxGoalsHome = 5;
        }

        int awayScore = random.nextInt(maxGoalsAway + 1);
        int homeScore = random.nextInt(maxGoalsHome + 1);

        game.setAway_score(awayScore);
        game.setHome_score(homeScore);

        // Update team statistics
        away.setTotal_goals_scored(away.getTotal_goals_scored() + awayScore);
        away.setGoals_score_allowed(away.getGoals_score_allowed() + homeScore);

        home.setTotal_goals_scored(home.getTotal_goals_scored() + homeScore);
        home.setGoals_score_allowed(home.getGoals_score_allowed() + awayScore);

        // Determine winner/loser/tie
        if (awayScore > homeScore) {
            away.setWin_total(away.getWin_total() + 1);
            home.setLoose_total(home.getLoose_total() + 1);
        } else if (homeScore > awayScore) {
            home.setWin_total(home.getWin_total() + 1);
            away.setLoose_total(away.getLoose_total() + 1);
        } else {
            away.setTit_total(away.getTit_total() + 1);
            home.setTit_total(home.getTit_total() + 1);
        }

        games.add(game);
    }

    // Get two random teams for matchup
    public Team[] getRandomTeamPair() {
        Team team1 = teams.get(random.nextInt(teams.size()));
        Team team2 = teams.get(random.nextInt(teams.size()));

        // Make sure they're different teams
        while (team2.equals(team1)) {
            team2 = teams.get(random.nextInt(teams.size()));
        }

        return new Team[]{team1, team2};
    }

    // Check if season should end (3 consecutive freezing weeks)
    public boolean isSeasonOver() {
        return freezing_weeks >= 3;
    }

    // Update freezing week counter
    public void updateFreezingWeek(boolean isFreezing) {
        if (isFreezing) {
            freezing_weeks++;
        } else {
            freezing_weeks = 0;
        }
    }

    // Print team statistics
    public void printTeamStats() {
        System.out.println("\n*********RESULTS*********\n");
        for (Team team : teams) {
            System.out.println("Team " + team.getName());
            System.out.println("Wins: " + team.getWin_total() + ", Losses: " + team.getLoose_total() + 
                             ", Ties: " + team.getTit_total());
            System.out.println("Points Scored: " + team.getTotal_goals_scored() + 
                             ", Points Allowed: " + team.getGoals_score_allowed());
            System.out.println();
        }
    }

    // Print game statistics
    public void printGameStats() {
        for (Game game : games) {
            game.print_stats();
            System.out.println();
        }
    }

    // Print season statistics
    public void printSeasonStats() {
        System.out.println("Hottest Temp: " + (int)hottest_temp);
        double avgTemp = total_temps / temp_count;
        System.out.println("Average Temp:" + avgTemp);
    }

    public ArrayList<Game> getGames() {
        return games;
    }
}
