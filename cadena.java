/**
 * Programa que comprueba si 
 * La palabra empieza por vocal
 * Si acaba por vocal
 * Si tiene letras acentuadas
 * Si tiene m,n o p
 * 
 * @author Sergio
 * @version 1.0
 *
 */
package examen;
import java.util.Scanner;
//Importamos Scanner

public class cadena {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe una palabra");
		String palabra = sc.next();
		//Usamos Scanner para leer la palabra que usaremos para los métodos
		
		sc.close();
		//Que no se os olvide cerrar el Scanner
		
		int contador = 0;
		boolean empiezaPorVocal = false;
		boolean acabaPorVocal = false;
		boolean hayMNP = false;
		//Inicializamos el resto de variables que usaremos en los métodos
		
		
		if (palabra.charAt(0) == 'a'|| palabra.charAt(0) == 'e' || palabra.charAt(0) == 'i'|| palabra.charAt(0) == 'o' || palabra.charAt(0) == 'u') {
			empiezaPorVocal = true;
		//Esta variable comprueba si la primera letra es una vocal, y en caso positivo devuelve true 
		}
		
			
		if (palabra.charAt(palabra.length() - 1) == 'a'|| palabra.charAt(palabra.length() - 1) == 'e' || palabra.charAt(palabra.length() - 1) == 'i'|| palabra.charAt(palabra.length() - 1) == 'o' || palabra.charAt(palabra.length() - 1) == 'u') {
			acabaPorVocal = true;
			//Esta variable hace lo mismo pero con la última letra
		}
		
		for (int i = 0; i < palabra.length() ; i++) {
			if (palabra.charAt(i) == 'á'|| palabra.charAt(i) == 'é' || palabra.charAt(i) == 'í'|| palabra.charAt(i) == 'ó' || palabra.charAt(i) == 'ú') {
				
			} else {
				contador ++;
			}
			//Usamos un for para recorrer toda la palabra y suma uno al contador con cada letra, pero si encuentra una letra acentuada no aumenta
		}
		
		
		for (int i = 0; i < palabra.length() ; i++) {
			if (palabra.charAt(i) == 'm'|| palabra.charAt(i) == 'p' || palabra.charAt(i) == 'n') {
				hayMNP = true;
			}
			//Este método lo que hace es buscar una m, n o p en la palabra, y en caso de encontrar alguna de esas letras devuelve true
		}
		
		System.out.printf("¿La palabra empieza por vocal? %b %n", empiezaPorVocal);
		System.out.printf("¿La palabra acaba por vocal? %b %n", acabaPorVocal);
		System.out.printf("Hay %d letras no acentuadas %n", contador);
		System.out.printf("¿Hay una m. n o p en %s ? %b %n", palabra, hayMNP);
		//Imprimimos todo en pantalla

		
	}
	

}
