package findChar;

public class program {
	public static void main(String[] args) {
		FindCharacter cf = new CharFinder();
		String word = "�rg�o";
		
		char uniqueChar = cf.findChar(word);
		System.out.println(uniqueChar);
	}
}
