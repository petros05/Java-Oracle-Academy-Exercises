public class Team {

    // Data Fields
    private String name;
    private int win_total;
    private int loose_total;
    private int tit_total;
    private int total_goals_scored;
    private int goals_score_allowed;

    // Constructor

    public Team(String name) {
        this.name = name;
    }

    // Getter and Setter
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public int getWin_total() {return win_total;}
    public void setWin_total(int win_total) {this.win_total = win_total;}
    public int getLoose_total() {return loose_total;}
    public void setLoose_total(int loose_total) {this.loose_total = loose_total;}
    public int getTit_total() {return tit_total;}
    public void setTit_total(int titTotal) {this.tit_total = titTotal;}
    public int getTotal_goals_scored() {return total_goals_scored;}
    public void setTotal_goals_scored(int totalGoalsScored)  {this.total_goals_scored = totalGoalsScored;}
    public int getGoals_score_allowed() {return goals_score_allowed;}
    public void setGoals_score_allowed(int goalsScoreAllowed) {this.goals_score_allowed = goalsScoreAllowed;}
}