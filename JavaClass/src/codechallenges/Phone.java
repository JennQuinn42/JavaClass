package codechallenges;

public class Phone {
	//state
	private String manufacturer;
	private String model;
	private float screenSize;
	private int memoryCapacity;
	
	//behaviour
	
	public String getManufacturer(){
		return this.manufacturer;
	}
	
	public void setManufacturer(String name){
		this.manufacturer = name;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public void setModel(String name){
		this.model = name;
	}

	public float getScreenSize(){
		return this.screenSize;
	}
	
	public void setScreenSize(float name){
		this.screenSize = name;
	}
	
	public int getMemoryCapacityInGb(){
		return this.memoryCapacity;
	}
	
	public void setMemoryCapacityInGb(int name){
		this.memoryCapacity = name;
	}
	
	public void setAll(String manufacturer, String model, float screenSize, int memoryCapacity){
		this.manufacturer = manufacturer;
		this.model = model;
		this.screenSize = screenSize;
		this.memoryCapacity = memoryCapacity;
	}
	
	public String printAll(){
		String output = this.manufacturer + "\n";
		output += this.model + "\n";
		output += this.screenSize + " inches \n";
		output += this.memoryCapacity + "GB \n";
		return output;
	}
	
}
