package findarray2;

public class program {
	public static void main(String[] args) {
		FindArray finder = new ArrayFinder();
		int[] array1 = {2, 5, 0, 7, 16, 9, 7, 12, 26};
		int[] array2 = {2, 12, 8};
		
		int retorno = finder.findArray(array1, array2);
		
		System.out.println(retorno);
	}
}
