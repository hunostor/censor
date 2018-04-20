package first;

public class FirstProject {

	public static void main(String[] args) {
		
		Human first = new Human();
		
		first.setName("Gyula");
		first.setAge(40);
		
		
		
		System.out.println(first.getName() == null ? "Ures" : " Nem ures: "+first.getName());
		
//	    if(first.getName() == null) {
//	    	System.out.println("nincs nev");
//	    } else {
//	    	System.out.println("van nev: "+first.getName());
//	    }
	    
	    
	}
}
