
public class Person {

	private String name;
	private int age;
	private char gender;
	private boolean isAlive;

	public String getName(){
		return this.name;
	}//end getName
	
	public void setName(String name){
		this.name = name;
	}//end setName
	
	public int getAge(){
		return this.age;
	}//end getAge
	
	public void setAge(int age){
		this.age = age;
	}//end setAge
	
	public char getGender(){
		return this.gender;
	}//end getGender
	
	public void setGender(char gender){
		this.gender = gender;
	}//end setGender
	
	public boolean isAlive(){
		return this.isAlive;
	}//end isAlive
	
	public void setIsAlive(boolean isAlive){
		this.isAlive = isAlive;		
	}//end setIsAlive
	
}//end class