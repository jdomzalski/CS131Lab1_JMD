package lab1b;

public class BasketballTeam extends SportsTeam {
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		super();
		setFieldGoals(0);
		setFieldGoalsAttempted(0);
		setFreeThrows(0);
		setFreeThrowsAttempted(0);
	}
	//end empty-constructor
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super();
		this.teamName = "0";
		this.teamMascot = "0";
		this.headCoach = "0";
	}
	//end preferred constructor
	public double fieldGoalPercentage() {
		double fieldGoals1 = (int) fieldGoals;
		double fieldGoalsAttempted1 = (int) fieldGoalsAttempted;
		return (fieldGoals1/fieldGoalsAttempted1);
	}
	//end fieldGoalPercentage method
	public double freeThrowPercentage() {
		double freeThrows1 = (int) freeThrows;
		double freeThrowsAttempted1 = (int) freeThrowsAttempted;
		return (freeThrows1/freeThrowsAttempted1);
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
