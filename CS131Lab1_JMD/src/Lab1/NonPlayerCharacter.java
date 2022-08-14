package Lab1;

import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	private boolean active;
	private String intelligenceType;
	
	public NonPlayerCharacter() {
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
		
	}
	//end empty-argument constructor
	
	public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
		super(uniqueID, personality);
		setActive(active);
		setIntelligenceType(intelligenceType);
		
	}
	//end preferred constructor
	
	public String reportStructure() {
		super.reportStructure();
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		return sb.toString();
		
	}
	
	public String introduce() {
		String NAME = uniqueID;
		String n = new String("Hello my name is: "+NAME);
		return n.toString();
		
	}
	public String exclaim() {
		String arr []= {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		Random random = new Random();
		String generator = arr[random.nextInt(arr.length)];
		return generator.toString();
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
		
	}

	public String getIntelligenceType() {
		return intelligenceType;
	}

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}

	@Override
	public String toString() {
		return "NonPlayerCharacter [active=" + active + ", intelligenceType=" + intelligenceType + ", uniqueID="
				+ uniqueID + ", personality=" + personality + "]";
	}

}//end class
