package entity;

import java.io.ObjectInputStream.GetField;
import java.util.Set;

public class Team {

	
	private int id;
	
	private String teamName;
	
	private String captainName;
	
	private String coachName;
	
	private float nRR;
	
	private boolean isQualified;
	
//	getter-setter
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}	
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	
	public String getCaptainName() {
		return captainName;
	}
	
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	public String getCoachName() {
		return coachName;
	}
	public void setnRR(float nRR) {
		this.nRR = nRR;
	}
	
	public float getnRR() {
		return nRR;
	}
	public void setQualified(boolean isQualified) {
		this.isQualified = isQualified;
	}
	
	public boolean isQualified() {
		return isQualified;
	}
	

	
}




