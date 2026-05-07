# Soccer League

## What is This Project?

Java program that simulates a soccer league season. The program keeps track of 4 teams, plays games between them, and stores statistics about wins, losses, ties, and goals scored.

The season ends when there are 3 weeks in a row that are too cold to play (temperature below 32°F).

## What Does Each Files Do

### 1. **Main.java** (Starting Point)
- Creates the soccer league
- Creates 4 teams (Team 1, Team 2, Team 3, Team 4)
- Adds the teams to the league
- Starts the season

### 2. **Team.java** (Team Information)
- Stores team data:
  - Team name
  - Total wins
  - Total losses
  - Total ties
  - Total goals scored
  - Total goals allowed
- Has getter and setter methods to get/change team information

### 3. **League.java** (Manages the League)
- Keeps track of all teams and games
- Randomly picks 2 different teams to play each week
- Calculates the score of each game based on temperature
- Updates team statistics after each game
- Tracks the hottest temperature and average temperature
- Counts 3 consecutive freezing weeks to end the season

### 4. **Game.java** (Game Information)
- Stores information about each game:
  - Game ID number
  - Away team and their score
  - Home team and their score
  - Temperature that day
- Prints out game details in a nice format

### 5. **Scheduler.java** (Runs the Season)
- Automatically generates a random temperature for each week (0-99°F)
- If temperature is 32°F or higher:
  - Plays 2 games that week
  - Picks random teams to play against each other
- If temperature is below 32°F:
  - Prints "Too cold to play"
  - Counts it as a freezing week
- When the season ends (3 consecutive freezing weeks), prints all statistics:
  - All team stats (wins, losses, ties, goals)
  - All game stats (game details with scores)
  - Season summary

---

## How the Game Rules Work

### Temperature Affects Goals
The temperature changes how many goals each team can score:

- **Below 40°F**: Cold, sluggish teams → Max 2 goals per team
- **40°F to 60°F**: Moderate weather → Max 3 goals per team
- **Above 60°F**: Warm, active teams → Max 5 goals per team

The actual score is random (between 0 and the maximum).

