package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Esta clase permite las diferentes acciones que se van a realizar en 
 * la aplicación
 * @author JairoA
 *
 */
public class Event implements ActionListener{
	public static final String WINDOW_MATRIX_A = "matrixA";
	public static final String WINDOW_MATRIX_B = "matrixB";
	public static final String WINDOW_MATRIX_SUM = "matrix sum";
	@Override
	public void actionPerformed(ActionEvent action) {
		if (action.getActionCommand().equals(WINDOW_MATRIX_A)) {
			System.out.println("Esta correctamente enlazado con el boton A");
		}
		if (action.getActionCommand().equals(WINDOW_MATRIX_B)) {
			System.out.println("Esta correctamente enlazado con el boton B");
		}
		if (action.getActionCommand().equals(WINDOW_MATRIX_SUM)) {
			System.out.println("Esta correctamente enlazado con el boton sum");
		}
	}

}
