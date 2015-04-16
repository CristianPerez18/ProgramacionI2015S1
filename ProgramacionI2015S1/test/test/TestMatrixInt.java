package test;

import console.InputConsole;
import console.OutputConsole;
import functional.MatrixInt;

public class TestMatrixInt {

	public static void main(String[] args) {
		
		System.out.println("Probar el constructor de la Matriz");
		MatrixInt matrixA;
		matrixA = new MatrixInt(3,2);
		System.out.println(matrixA);
		OutputConsole.print(matrixA.getArray());
		
		System.out.println("Probar el metodo static generate de una matrix");
		int[][] matrixB;
		matrixB = MatrixInt.generate(4, 5);
		OutputConsole.print(matrixB);
		
		System.out.println("Probar la suma de matrices con dos matrices del mismo tamaño");
		int[][] matA, matB, matC;
		matA = MatrixInt.generate(2,3);
		matB = MatrixInt.generate(2,3);
		matC = MatrixInt.sum(matA, matB);
		OutputConsole.print(matA);
		System.out.println(" + ");
		OutputConsole.print(matB);
		System.out.println("=");
		OutputConsole.print(matC);
	}
}
