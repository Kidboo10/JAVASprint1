package obj18.sprint1.demos.enums;

import obj18.sprint1.demos.enums.TeamPlayer.Team;
import java.util.ArrayList;
import java.util.List;

public class TeamPlayerDemo
{
    public static void main(String[] args){
        
        TeamPlayer Bosse = new TeamPlayer("Bosse", Team.BLUE);
        
        List<TeamPlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new TeamPlayer("Kalle", Team.BLUE));
        allPlayers.add(new TeamPlayer("Mimmi", Team.RED));
        allPlayers.add(new TeamPlayer("Pelle", Team.YELLOW));
        allPlayers.add(Bosse);
        //allPlayers.add(TeamPlayer.Team.YELLOW);
        
        //skriver ut enum-konstantvärdet
        for (TeamPlayer player: allPlayers){
            System.out.println(player.name +" in team "+ player.getTeam()
                    + " " +player.getTeam().teamName );
        }
        //itererar genom alla teams värden
        for (Team team : Team.values()){
            System.out.println(team.name()+" "+team.toString()+" "
                    +team.teamName+" "+team.ordinal());
        }
        //Team t = Enum.valueOf(Team.class, "BLUE") ;
        //System.out.println(t);
    }
    
}


