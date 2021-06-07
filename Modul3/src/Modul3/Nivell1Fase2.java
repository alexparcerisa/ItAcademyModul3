/*
Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l'informacio a un array (arrayCiutats). 
Quan tinguem l'array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. 
 */

package Modul3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Nivell1Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Benvingut a un nou exercici de l'IT");
		System.out.println("Siusplau, introdueix 6 noms de ciutats");
		
		ArrayList<String> ciutatsList = new ArrayList<String>();
		String[] ciutatsArray = new String[6];
		
		ciutat1 = entrada.nextLine();
		ciutatsList.add(ciutat1);
		ciutatsArray[0] = ciutat1;
		ciutat2 = entrada.nextLine();
		ciutatsList.add(ciutat2);
		ciutatsArray[1] = ciutat2;
		ciutat3 = entrada.nextLine();
		ciutatsList.add(ciutat3);
		ciutatsArray[2] = ciutat3;
		ciutat4 = entrada.nextLine();
		ciutatsList.add(ciutat4);
		ciutatsArray[3] = ciutat4;
		ciutat5 = entrada.nextLine();
		ciutatsList.add(ciutat5);
		ciutatsArray[4] = ciutat5;
		ciutat6 = entrada.nextLine();
		ciutatsList.add(ciutat6);	
		ciutatsArray[5] = ciutat6;
		
		entrada.close();
		
		
		System.out.println("Llista ordenada alfabèticament de les ciutats introduïdes:");
		
		System.out.println("-----Llista-----");
		
		Collections.sort(ciutatsList);
		for (String i : ciutatsList) {
	      System.out.println(i);
		}
		
	    System.out.println("------Array------");
	    Arrays.sort(ciutatsArray);
	    System.out.println(Arrays.toString(ciutatsArray));
	    
	}

}
