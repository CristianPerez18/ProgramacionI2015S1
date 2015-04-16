package test;

import console.InputConsole;
import console.OutputConsole;
import functional.MatrixInt;

public class TestConsole {
	public static void main(String[] args) {
		System.out.println("Prueba de funcionalidad del programa solicitado");
		byte rows = InputConsole.inByte("Por favor digitar la cantidad de filas de las matrices");
		byte columns = InputConsole.inByte("Por favor digitar la cantidad de columnas de las matrices");
		MatrixInt objMatrixA = new MatrixInt(rows, columns);
		objMatrixA.generate();
		MatrixInt objMatrixB = new MatrixInt(rows, columns);
		objMatrixB.generate();
		MatrixInt objMatrixC = new MatrixInt(rows, columns); 
		objMatrixC.setArray(MatrixInt.sum(objMatrixA.getArray(), 
										  objMatrixB.getArray()));		
		OutputConsole.print(objMatrixA.getArray());
		OutputConsole.print(objMatrixB.getArray());
		OutputConsole.print(objMatrixC.getArray());
	}
}
