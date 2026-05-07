import java.util.Random;

public class Scheduler {
    private League league;

    // Constructor
    public Scheduler(League league) {
        this.league = league;
    }

    // Run the season
    public void runSeason() {
        System.out.println("run:");

        Random random = new Random();

        while (!league.isSeasonOver()) {
            // Get random temperature
            int temperature = random.nextInt(100);

            // Check if it's freezing
            if (temperature < 32) {
                System.out.println("Too cold to play.");
                league.updateFreezingWeek(true);
            } else {
                league.updateFreezingWeek(false);
                
                // Play 2 games this week
                for (int i = 0; i < 2; i++) {
                    Team[] matchup = league.getRandomTeamPair();
                    league.playGame(matchup[0], matchup[1], temperature);
                }
            }
        }

        System.out.println("Season is over");
        System.out.println();
        
        // Print all team stats
        league.printTeamStats();
        
        // Print all game stats
        league.printGameStats();
        
        // Print season summary
        league.printSeasonStats();
    }
}
