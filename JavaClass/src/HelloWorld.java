
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Person p1 = new Person();
		
		System.out.println("Hello " + p1.getName());
		
		p1.setName("James Gosling");
		System.out.println("Hello " + p1.getName());
		
		Person p2 = new Person();
		p2.setName("Joe Bloggs");
		System.out.println("Hello " + p2.getName());
		
		System.out.println(p1.getName() + " meet " + p2.getName());
		
		System.out.println("Is " + p1.getName() + " alive? "  + p1.isAlive());
		
		if(p1.isAlive()){
			System.out.println(p1.getName() + " and " + p2.getName() + " are now friends.");			
		}//end if Alive
		else{
			System.out.println("Oh dear, " + p1.getName() + " is now eating " + p2.getName());
		}//end if not alive
		
		p1.setIsAlive(!p1.isAlive());
		
		if(p1.isAlive()){
			System.out.println(p1.getName() + " and " + p2.getName() + " are now friends.");			
		}//end if Alive
		else{
			System.out.println("Oh dear, " + p1.getName() + " is now eating " + p2.getName());
		}//end if not alive
		
	}//end main method

}//end class HelloWorld 