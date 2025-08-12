package repository;

import entity.Team;

public class TeamRepository {
	
	public static Team getMITeamDetails()
	{
		Team team = new Team();
		team.setId(10);
		team.setTeamName("Team name is: " + "Mumbai Indian");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		return team;
		
	}
	
//	add similar methods for remaining 9 teams
	
	public static Team getRCBTeamDetails() {
		Team team1 = new Team();
		team1.setId(10);
		team1.setTeamName("Royal challenges");
		team1.setCaptainName("Virat Kohli");
		team1.setCoachName("Vijay");
		team1.setnRR(5.2f);
		team1.equals(true);
		return team1;
	}

}


 	