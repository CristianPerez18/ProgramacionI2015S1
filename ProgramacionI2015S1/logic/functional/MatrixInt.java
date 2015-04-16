package functional;

/**
 * @author JairoA
 * @version 1.0
 * @created 14-abr.-2015 4:20:51 p. m.
 */
public class MatrixInt {
	//-------------------- Declaracion de Constantes
	public static final int MIN_ROWS = 2;
	public static final int MIN_COLUMNS = 2;
	public static final int MAX_COLUMNS = 50;
	public static final int MAX_ROWS = 50;
	public static final int MAX_NUMBER = 1000;
	//-------------------- Declaracion de Atributos
	/**
	 * Es el arreglo para guardar los datos de la matriz
	 */
	private int[][] array;
	/**
	 * Cantidad de filas de la matriz
	 */
	private int rows;
	/**
	 * Cantidad de columnas de la matriz
	 */
	private int columns;
	//-------------------- Declaracion de Contructores
	public MatrixInt(int rows, int columns){		
		this.rows = rows;
		this.columns = columns;
		this.array = new int[rows][columns];
	}
	//-------------------- Implementación de operaciones o metodos	
	/**
	 * <font color="#ff0000">Generar una matriz con los datos en cada celda
	 * automáticamente de acuerdo a una dimensión establecida</font>
	 * 
	 * @param columns
	 * @param rows
	 */
	public static int[][] generate(int rows, int columns){
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * MAX_NUMBER);
			}
		}
		return matrix;
	}
	/**
	 * <font color="#ff0000">Generar en la matriz datos en cada celda
	 * automáticamente de acuerdo a la dimensión que se tiene</font>
	 * 
	 */
	public void generate(){
		this.array = generate(this.rows, this.columns);
	}

	/**
	 * 
	 * @param matrixB
	 * @param matrixA
	 */
	public static int[][] sum(int[][] matrixA, int[][] matrixB){
		int[][] matrix = new int[matrixA.length][matrixA[0].length];
		for (int i = 0; i < matrixB.length; i++) {
			for (int j = 0; j < matrixB[i].length; j++) {
				matrix[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		return matrix;
	}
	//-----------Implementación de setter y getters
	public int[][] getArray() {
		return array;
	}
	public void setArray(int[][] array) {
		this.array = array;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}	
}