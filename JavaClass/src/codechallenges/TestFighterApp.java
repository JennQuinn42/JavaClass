package codechallenges;

public class TestFighterApp {

	public static void main(String[] args) {
		Fighter[] fight = new Fighter[3];

		for(int i = 0; i < fight.length; i++){
			fight[i] = new Fighter();
			fight[i].setName("Joe Bloggs");
			fight[i].setWeightClass("Lightweight");
			fight[i].setWeightInKg((66.2 + i));
		}
		
		for(int i = 0; i < fight.length; i++){
			System.out.println(fight[i].toString());
		}
	}

}
