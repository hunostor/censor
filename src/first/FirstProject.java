package first;

public class FirstProject {

	public static void main(String[] args) {
		
		String eredmeny = censor("A kutya nagyon aranyos", "kutya", "macska");
		System.out.println("Proba: "+eredmeny);
	}
	
	static String censor(String text, String toChange, String newWord) {
		
		text = text.replaceAll(toChange, newWord);
		
		
		return text;
	}

}
