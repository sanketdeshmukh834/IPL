package main;
import entity.Team;
import repository.TeamRepository;
import service.Teamservice;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teamservice service = new Teamservice();
		service.printTeamDetails();

	}

}
