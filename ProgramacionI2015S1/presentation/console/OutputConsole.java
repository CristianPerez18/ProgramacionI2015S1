package console;

/**
 * @author JairoA
 * @version 1.0
 * @created 14-abr.-2015 4:39:59 p. m.
 */
public class OutputConsole {	
	/**
	 * 
	 * @param matrix
	 */
	public static void print(int[][] matrix){
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}