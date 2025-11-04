package edu.augustana.csc305.project;
public class Referee extends User{ //can't log in as ref, level gained when assigned ref by an Organizer
	private String name;
	private String username;
	//private final String password;
	private Court court; //court assignment

	public Referee(String name, String username, String passward, Court court){
		super(name, username, passward);
		this.court = court;
	}
}
