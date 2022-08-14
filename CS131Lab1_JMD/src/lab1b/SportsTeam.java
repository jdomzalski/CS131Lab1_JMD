package lab1b;

public abstract class SportsTeam {
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	public SportsTeam() {
		setTeamName(" ");
		setTeamMascot(" ");
		setHeadCoach(" ");
		setWins(0);
		setLosses(0);
	}
	//end empty-constructor
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		setTeamName("0");
		setTeamMascot("0");
		setHeadCoach("0");
	}
	//end preferred constructor
	public double getWinPercentage() {
		double wins1 = (int) wins;
		double losses1 = (int) losses;
		return wins1/(wins1+losses1);
	}
	//end WinPercentage method
	public abstract double[] getStats();
	//end getStats abstract method 
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamMascot() {
		return teamMascot;
	}
	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}
	public String getHeadCoach() {
		return headCoach;
	}
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	//end getters and setters
	
	
}
//end class
