package ejerciciosexaprogrmacionclase;

import java.util.Scanner;

public class dnibuenoomalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="05273323K";
		String cadena2=cadena.substring(0,cadena.length()-1);
		int numero =Integer.parseInt(cadena2);
		
		if( letraDNI(numero).equals(cadena.substring(8))){
			System.out.println("Correcto");
		}
		else{
			System.out.println("Incorrecto");
		}
		
	}
public static String letraDNI(int numero){
		
		int resto = numero % 23;
		
	
		String letra ="";
		
		switch (resto){
		
		case 0:
			letra = "T";
			System.out.println("es esta letra");
			break;
		
		case 1:
			letra = "R";
			System.out.println("es esta letra");
			break;
		
		case 2:
			letra = "W";
			System.out.println("es esta letra");
			break;
			
		case 3:
			letra = "A";
			System.out.println("es esta letra");
			break;
		
		case 4:
			letra = "G";
			System.out.println("es esta letra");
			break;
		case 5:
			letra = "M";
			System.out.println("es esta letra");
			break;
		case 6:
			letra = "Y";
			System.out.println("es esta letra");
			break;
		case 7:
			letra = "F";
			System.out.println("es esta letra");
			break;
		case 8:
			letra = "P";
			System.out.println("es esta letra");
			break;
		case 9:
			letra = "D";
			System.out.println("es esta letra");
			break;
		case 10:
			letra = "X";
			System.out.println("es esta letra");
			break;
		case 11:
			letra = "B";
			System.out.println("es esta letra");
			break;
		case 12:
			letra = "N";
			System.out.println("es esta letra");
			break;
		case 13:
			letra = "J";
			System.out.println("es esta letra");
			break;
		case 14:
			letra = "Z";
			System.out.println("es esta letra");
			break;
		case 15:
			letra = "S";
			System.out.println("es esta letra");
			break;
		case 16:
			letra = "Q";
			System.out.println("es esta letra");
			break;
		case 17:
			letra = "V";
			System.out.println("es esta letra");
			break;
		case 18:
			letra = "H";
			System.out.println("es esta letra");
			break;
		case 19:
			letra = "L";
			System.out.println("es esta letra");
			break;
		case 20:
			letra = "C";
			System.out.println("es esta letra");
			break;
		case 21:
			letra = "K";
			System.out.println("es esta letra");
			break;	
		case 22:
			letra = "E";
			System.out.println("es esta letra");
				
		
		default:
			System.out.println("Algo va mal");
			break;
		}
		
		
		return letra;
		
}
}
