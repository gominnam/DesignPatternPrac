package Behavior_Patterns.Strategy.beans;

public abstract class Team {
    private String teamName;
    private TeamStrategy teamStrategy; // strategy references

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public TeamStrategy getTeamStrategy() {
        return teamStrategy;
    }

    public void setTeamStrategy(TeamStrategy teamStrategy) {
        this.teamStrategy = teamStrategy;
    }

    public abstract void teamInfo();

    public void playGame(){
        teamStrategy.play(teamName);
    }

}