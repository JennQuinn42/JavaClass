package codechallenges;

public class Human extends Lifeform {

	public Human(){
		super(("Agent Smith" + (-1)), -1);
	}
	
	public Human(int name, int power){
		super(("Agent Smith" + name), power);
	}
	
	public int getPower(){
		return super.getPower();
	}
	
}
