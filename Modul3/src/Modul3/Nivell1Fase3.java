/*
Cambieu les vocals �a� dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). 
Mostreu per consola l�array modificat i ordenat per ordre alfabetic.
 */

package Modul3;

import java.util.Arrays;
import java.util.Scanner;

public class Nivell1Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Benvingut a un nou exercici de l'IT");
		System.out.println("Siusplau, introdueix 6 noms de ciutats");
				
		String[] ciutatsArray = new String[6];
		
		ciutat1 = entrada.nextLine();
		ciutatsArray[0] = ciutat1;
		ciutat2 = entrada.nextLine();
		ciutatsArray[1] = ciutat2;
		ciutat3 = entrada.nextLine();
		ciutatsArray[2] = ciutat3;
		ciutat4 = entrada.nextLine();
		ciutatsArray[3] = ciutat4;
		ciutat5 = entrada.nextLine();
		ciutatsArray[4] = ciutat5;
		ciutat6 = entrada.nextLine();
		ciutatsArray[5] = ciutat6;
		
		entrada.close();
		
		String[] ciutatsModificades = new String[6];
		
		for (int i = 0; i<=5; i++) {
			ciutatsModificades[i] = ciutatsArray[i].replace("a", "4");
			
		}

		Arrays.sort(ciutatsModificades);
	    System.out.println(Arrays.toString(ciutatsModificades));
								
	}

}
