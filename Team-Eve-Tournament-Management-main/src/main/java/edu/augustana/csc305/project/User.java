package edu.augustana.csc305.project;
abstract class User{
	private String name;
	private String username;
	private final String password;
	//private String permissionLevel;

	//default when not logged in
	public User(){
		this("Visitor", "Visitor", "");
	}

	//for when logged in, Organizer and Referee
	public User(String name, String username, String password){
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
}
