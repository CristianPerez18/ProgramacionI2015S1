package test;

import gui.JDialogMatrix;

public class TestJDialogMatrix {

	public static void main(String[] args) {
		JDialogMatrix dialogA = new JDialogMatrix();
		dialogA.setTitle("MATRIZ A");
		dialogA.setVisible(true);
		
		JDialogMatrix dialogB = new JDialogMatrix();
		dialogB.setTitle("MATRIZ B");
		dialogB.setLocation(dialogA.getX()+dialogA.getWidth()+5, dialogA.getY());
		dialogB.setVisible(true);
	}

}
