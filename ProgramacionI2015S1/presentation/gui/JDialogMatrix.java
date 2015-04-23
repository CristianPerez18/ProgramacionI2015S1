package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * Esta ventana 
 * @author JairoA
 *
 */
public class JDialogMatrix extends JDialog{
	private DefaultTableModel modelJTable;
	private JTable jTableMatrix;
	private JButton jButtonSave;
	
	public JDialogMatrix() {
		setBounds(50, 50, 300, 350);
		setLayout(new BorderLayout());
		init();
	}
	
	public void init(){
		modelJTable = new DefaultTableModel(3, 3);
		jTableMatrix = new JTable(modelJTable);
		add(jTableMatrix, BorderLayout.CENTER);
		jButtonSave = new JButton();
		add(jButtonSave, BorderLayout.SOUTH);
	}
}
