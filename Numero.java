package examen;

public class Numero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 15; //args[0];
		//int numero = Integer.parseInt(numeroString);
		
		if (numero >= 4 && numero <= 1000) {
			boolean par = numero % 2 == 0;
			esPar(numero);
			boolean divisible3y5 = numero % 3 == 0 && numero % 5 == 0;
			

			System.out.printf("¿%d es par?, %b %n", numero, par);
			System.out.printf("¿%d es divisible entre 3 y 5?, %b", numero, divisible3y5);
				
		} else {
			System.out.println("El número introducido no es correcto");
		}	
	}
	
	public static boolean esPar (int numero) {
		boolean par = numero % 2 == 0;
		return par;
	}
}


