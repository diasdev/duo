package findarray2;

public class ArrayFinder implements FindArray {
	
	public int findArray(int[] array, int[] subArray) {
		
		if (subArray.length > 0)  {
			int elementToFind = subArray[0];
			
			for (int index = array.length - 1; index >= 0; index--) {
				if (array[index] == elementToFind) {
					return index;
				}	
			}
		}
		
		return -1;
	}
}
