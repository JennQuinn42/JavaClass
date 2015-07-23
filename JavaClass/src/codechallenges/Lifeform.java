package codechallenges;

public class Lifeform {
	protected String ID;
	protected int power;

	public Lifeform(String ID, int power) {
		this.ID = ID;
		this.power = power;
	}

	public String getID() {
		return this.ID;
	}

	public int getPower() {
		return this.power;
	}
}