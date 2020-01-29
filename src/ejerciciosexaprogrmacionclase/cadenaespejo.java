package ejerciciosexaprogrmacionclase;

import java.util.Scanner;

public class cadenaespejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);
		System.out.println("dime una cadena: ");
		String cadena=s.nextLine();
		System.out.print(cadena);
		System.out.print(darlavuelta(cadena));
		
	}
	
	public static String darlavuelta(String s){
		StringBuilder cadena = new StringBuilder(s); 
		cadena.reverse();
		cadena.delete(0,1);
		return cadena.toString();
		
	}

}
