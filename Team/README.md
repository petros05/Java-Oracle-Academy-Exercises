# Soccer League Simulator

## What is This Project?

This is a Java program that simulates a soccer league season. The program keeps track of 4 teams, plays games between them, and stores statistics about wins, losses, ties, and goals scored.

The season ends when there are 3 weeks in a row that are too cold to play (temperature below 32°F).

---

## The Classes (What Each File Does)

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
- Asks the user to enter a temperature each week
- If temperature is 32°F or higher:
  - Plays 2 games that week
  - Picks random teams to play
- If temperature is below 32°F:
  - Prints "Too cold to play"
  - Counts it as a freezing week
- When the season ends (3 freezing weeks), prints all statistics

---

## How the Game Rules Work

### Temperature Affects Goals
The temperature changes how many goals each team can score:

- **Below 40°F**: Cold, sluggish teams → Max 2 goals per team
- **40°F to 60°F**: Moderate weather → Max 3 goals per team
- **Above 60°F**: Warm, active teams → Max 5 goals per team

The actual score is random (between 0 and the maximum).

### Winning, Losing, and Ties
- If away team scores more goals → away team wins, home team loses
- If home team scores more goals → home team wins, away team loses
- If both teams score the same → it is a tie for both teams

### Numbers You See in Output
- **Wins**: Number of games the team won
- **Losses**: Number of games the team lost
- **Ties**: Number of games that were tied
- **Points Scored**: Total goals the team scored all season
- **Points Allowed**: Total goals scored against the team all season

---

## Example Input and Output

### Input (What You Type)
```
run:
Enter temperature: 90
Enter temperature: 90
Enter temperature: 35
Enter temperature: 35
Enter temperature: 30
Enter temperature: 20
Enter temperature: 25
```

### Output (What the Program Shows)
```
run:
Enter temperature: 90
Enter temperature: 90
Enter temperature: 35
Enter temperature: 35
Enter temperature: 30
Too cold to play.
Enter temperature: 20
Too cold to play.
Enter temperature: 25
Too cold to play.
Season is over

*********RESULTS*********

Team 1
Wins: 1, Losses: 1, Ties: 0
Points Scored: 9, Points Allowed: 9

Team 2
Wins: 1, Losses: 1, Ties: 0
Points Scored: 8, Points Allowed: 8

Team 3
Wins: 0, Losses: 1, Ties: 1
Points Scored: 6, Points Allowed: 9

Team 4
Wins: 1, Losses: 0, Ties: 1
Points Scored: 8, Points Allowed: 5

Game #1
Temperature: 90
Away Team: Team 2, 4
Home Team: Team 4, 7

Game #2
Temperature: 90
Away Team: Team 1, 8
Home Team: Team 3, 5

Game #3
Temperature: 35
Away Team: Team 1, 1
Home Team: Team 2, 8

Game #4
Temperature: 35
Away Team: Team 3, 1
Home Team: Team 4, 1

Hottest Temp: 90
Average Temp: 62.5
```

---

## Key Points to Remember

✓ Each week, the user enters ONE temperature  
✓ If temperature ≥ 32°F: 2 random games are played that week  
✓ If temperature < 32°F: No games, just count as a freezing week  
✓ Season ends when there are 3 freezing weeks in a row  
✓ Warmer temperatures allow for more goals  
✓ All team statistics are printed at the end  
✓ Hottest temperature and average temperature are calculated  

---

## File Structure
```
Team/
├── README.md
├── src/
│   ├── Main.java
│   ├── League.java
│   ├── Scheduler.java
│   ├── Team.java
│   └── Game.java
└── Team.iml
```

---

## Summary

This program simulates a realistic soccer league where:
- Weather affects how the game is played
- Teams keep detailed statistics
- The season continues until winter arrives
- Everything is displayed neatly at the end

Have fun running the simulator!
