package Behavior_Patterns.Strategy.test;

import Behavior_Patterns.Strategy.beans.*;

import java.util.jar.JarEntry;

public class Play {

    public static void main(String[] args){

        Team koreaTeam = new TeamKorea();
        Team japanTeam = new TeamJapan();

        // Strategies
        TeamStrategy attack = new AttackStrategy();
        TeamStrategy defend = new DefendStrategy();

        koreaTeam.setTeamName("Korea");
        japanTeam.setTeamName("Japan");

        // select strategy
        koreaTeam.setTeamStrategy(attack);
        japanTeam.setTeamStrategy(defend);

        koreaTeam.teamInfo();
        koreaTeam.playGame();

        japanTeam.teamInfo();
        japanTeam.playGame();
    }
}
