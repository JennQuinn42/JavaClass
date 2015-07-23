package codechallenges;

public class Fighter {

	private String name;
	private double weightInKg;
	private String weightClass;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}
	public void setWeightClass(String weightClass) {
		this.weightClass = weightClass;
	}
	
	public String toString(){
		if(this.name != null){
			return "Fighter " + this.name + " has a weight of " 
					+ this.weightInKg + "kg and will be fighting in the "
					+ this.weightClass + ".";
		}
		else{
			return "Sorry you need to input a fighter.";
		}
	}
	
}
