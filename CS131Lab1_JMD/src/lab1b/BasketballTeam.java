package lab1b;

public class BasketballTeam extends SportsTeam {
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		setFieldGoals(0);
		setFieldGoalsAttempted(0);
		setFreeThrows(0);
		setFreeThrowsAttempted(0);
	}
	//end empty-constructor
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = "0";
		this.teamMascot = "0";
		this.headCoach = "0";
	}
	//end preferred constructor
	public double fieldGoalPercentage() {
		return (fieldGoals/fieldGoalsAttempted);
	}
	//end fieldGoalPercentage method
	public double freeThrowPercentage() {
		return (freeThrows/freeThrowsAttempted);
	}
	//end freeThrowPercentage method
	public double[] getStats() {
		double arr[] = {(wins/wins+losses), (fieldGoals/fieldGoalsAttempted), (freeThrows/freeThrowsAttempted)};
		return arr;
	}
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		
	}
	//end setStats --> abstract? having problems here
	public int getFieldGoals() {
		return fieldGoals;
	}
	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}
	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}
	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}
	public int getFreeThrows() {
		return freeThrows;
	}
	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}
	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}
	//end getters and setters
	
	
	

}
//end class
