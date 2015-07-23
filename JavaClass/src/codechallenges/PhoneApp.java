package codechallenges;

public class PhoneApp {

	public static void main(String[] args) {
		
		Phone SamsungS5 = new Phone();		
		SamsungS5.setManufacturer("Samsung");
		SamsungS5.setModel("S5");
		SamsungS5.setScreenSize(5f);
		SamsungS5.setMemoryCapacityInGb(4);
		
//		System.out.println(SamsungS5.getManufacturer() + ", " + SamsungS5.getModel() + ", " 
//				+ SamsungS5.getScreenSize() + " inches, " + SamsungS5.getMemoryCapacityInGb() + "GB");
		
		Phone SamsungS6 = new Phone();
		SamsungS6.setManufacturer("Samsung");
		SamsungS6.setModel("S6");
		SamsungS6.setScreenSize(6f);
		SamsungS6.setMemoryCapacityInGb(8);
		
//		System.out.println(SamsungS6.getManufacturer() + ", " + SamsungS6.getModel() + ", " 
//				+ SamsungS6.getScreenSize() + " inches, " + SamsungS6.getMemoryCapacityInGb() + "GB");
//		
		Phone HTCx55 = new Phone();		
		HTCx55.setManufacturer("HTC");
		HTCx55.setModel("x55");
		HTCx55.setScreenSize(5.5f);
		HTCx55.setMemoryCapacityInGb(5);
		
//		System.out.println(HTCx55.getManufacturer() + ", " + HTCx55.getModel() + ", " 
//				+ HTCx55.getScreenSize() + " inches, " + HTCx55.getMemoryCapacityInGb() + "GB");
		
		System.out.println(SamsungS5.printAll());
		System.out.println(SamsungS6.printAll());
		System.out.println(HTCx55.printAll());
		
		System.out.println("Total screen size is: " + (SamsungS5.getScreenSize() + SamsungS6.getScreenSize() + HTCx55.getScreenSize()) + " inches");
		
		System.out.println("Total Memory Capacity of is: " + (SamsungS5.getMemoryCapacityInGb() + SamsungS6.getMemoryCapacityInGb() 
			+ HTCx55.getMemoryCapacityInGb()) + "GB");		
	}
}
