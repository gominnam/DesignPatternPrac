package Behavior_Patterns.Strategy.beans;

public class DefendStrategy implements TeamStrategy{
    @Override
    public void play(String team) {
        System.out.println(team + " will play in defendStrategy");
    }
}
