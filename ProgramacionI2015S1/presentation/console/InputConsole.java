package console;

import java.util.Scanner;

/**
 * Esta parte de la clase que uds. ya tiene declarada
 * @author SALA
 *
 */
public class InputConsole {
	
	public static short inShort(String message){		
		Scanner reader = new Scanner(System.in);
		System.out.print(message);
		return reader.nextShort();
	}
	
	public static byte inByte(String message){		
		Scanner reader = new Scanner(System.in);
		System.out.print(message);
		return reader.nextByte();
	}
	
	public static boolean inBoolean(String message){
		boolean result = false;
		Scanner reader = new Scanner(System.in);
		System.out.print(message);
		result = reader.nextBoolean();
		return result;
	}
}
