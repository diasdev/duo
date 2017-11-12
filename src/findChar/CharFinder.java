package findChar;

public class CharFinder implements FindCharacter {
	public char findChar(String word) {
		int charCount;
		for (char c:word.toCharArray()) {
			charCount = 0;
			for (int index = 0; index <= word.length() - 1; index++) {
				if (word.toCharArray()[index] == c)
					charCount++;
			}
			if (charCount == 1)
				return c;
			
		}
		
		return '\0';
	}
}
