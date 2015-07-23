package codechallenges;

public class Robot extends Lifeform{
	private String modelName;
	
	public Robot(String modelName, String ID, int power){
		super(ID, power);
		this.modelName = modelName;
	}
	
	public String getModelName(){
		return this.modelName;
	}
}