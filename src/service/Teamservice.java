package service;

import entity.Team;
import repository.TeamRepository;


public class Teamservice {

	public void printTeamDetails()
	{
		Team team = TeamRepository.getMITeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
		
	}
	
	{
		Team team = TeamRepository.getRCBTeamDetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}
}
