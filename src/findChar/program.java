package findChar;

public class program {
	public static void main(String[] args) {
		CharFinder cf = new CharFinder();
		String word = "constitucionalicimamente";
		
		char uniqueChar = cf.findChar(word);
		System.out.println(uniqueChar);
	}
}
