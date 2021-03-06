package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class JFrameMain extends JFrame{
	
	private JLabel jLabelRows;
	private JTextField jTextFieldRows;
	private JLabel jLabelColumns;
	private JTextField jTextFieldColumns;
	private JButton jButtonMatrixA;
	private JButton jButtonMatrixB;
	private JButton jButtonSum;
	private Event event;
	
	public JFrameMain() {		
		setTitle("SUMA DE MATRICES");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 4));		
		init();
	}
	/**
	 * Construir los atributos y asignarles la funcionalidad conrrespondiente
	 */
	public void init(){
		event = new Event();
		jLabelRows = new JLabel("Filas");
		add(jLabelRows);
		jTextFieldRows = new JTextField();
		add(jTextFieldRows);
		jLabelColumns = new JLabel("Columnas");
		add(jLabelColumns);
		jTextFieldColumns = new JTextField();
		add(jTextFieldColumns);	
		jButtonMatrixA = new JButton("Matriz A");
		jButtonMatrixA.addActionListener(event);
		jButtonMatrixA.setActionCommand(Event.WINDOW_MATRIX_A);
		add(jButtonMatrixA);
		jButtonMatrixB = new JButton("Matriz B");
		jButtonMatrixB.addActionListener(event);
		jButtonMatrixB.setActionCommand(Event.WINDOW_MATRIX_B);
		add(jButtonMatrixB);
		jButtonSum = new JButton("Sumar");
		jButtonSum.addActionListener(event);
		jButtonSum.setActionCommand(Event.WINDOW_MATRIX_SUM);
		add(jButtonSum);
	}
	
	
}
