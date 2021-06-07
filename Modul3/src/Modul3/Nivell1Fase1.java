/*
Crea sis variables tipu string buides. 
Demana per consola que s'introdueixin els noms.  
Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. 
Mostra per consola el nom de les 6 ciutats. 
 */

package Modul3;

import java.util.Scanner;

public class Nivell1Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Benvingut a un nou exercici de l'IT");
		System.out.println("Siusplau, introdueix 6 noms de ciutats");
		
		ciutat1 = entrada.nextLine();
		ciutat2 = entrada.nextLine();
		ciutat3 = entrada.nextLine();
		ciutat4 = entrada.nextLine();
		ciutat5 = entrada.nextLine();
		ciutat6 = entrada.nextLine();
		
		entrada.close();
		
		System.out.println("Has introduït les següents ciutats: " + ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + ciutat4 + ", " + ciutat5 + " y " + ciutat6 + ".");
						
		
	}

}
