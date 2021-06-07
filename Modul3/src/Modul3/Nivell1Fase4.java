/*
Creeu un nou array de caràcters (char array[])per cada una de les ciutats que tenim. 
La mida dels nous arrays sera la llargada de cada string (string nomCiutat.Length).  
Ompliu els nous arrays lletra per lletra. 
Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). 
*/

package Modul3;

import java.util.Scanner;

public class Nivell1Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Benvingut a un nou exercici de l'IT");
		System.out.println("Siusplau, introdueix 6 noms de ciutats");
		
		ciutat1 = entrada.nextLine();
		char[] ciutatArray1 = new char[ciutat1.length()];
		
		for ( int k = 0; k < ciutat1.length(); k++) {
		     ciutatArray1[k]=ciutat1.charAt(k);
		     } 
		
		ciutat2 = entrada.nextLine();
		char[] ciutatArray2 = new char[ciutat2.length()];
		
		for ( int k = 0; k < ciutat2.length(); k++) {
		     ciutatArray2[k]=ciutat2.charAt(k);
		     } 
		
		ciutat3 = entrada.nextLine();
		char[] ciutatArray3 = new char[ciutat3.length()];
		
		for ( int k = 0; k < ciutat3.length(); k++) {
		     ciutatArray3[k]=ciutat3.charAt(k);
		     } 
		
		ciutat4 = entrada.nextLine();
		char[] ciutatArray4 = new char[ciutat4.length()];
		
		for ( int k = 0; k < ciutat4.length(); k++) {
		     ciutatArray4[k]=ciutat4.charAt(k);
		     } 
		
		ciutat5 = entrada.nextLine();
		char[] ciutatArray5 = new char[ciutat5.length()];
		
		for ( int k = 0; k < ciutat5.length(); k++) {
		     ciutatArray5[k]=ciutat5.charAt(k);
		     } 
		
		ciutat6 = entrada.nextLine();
		char[] ciutatArray6 = new char[ciutat6.length()];
		
		for ( int k = 0; k < ciutat6.length(); k++) {
		     ciutatArray6[k]=ciutat6.charAt(k);
		     } 
		
		entrada.close();
		
		/*  Primer intent, massa llarg!!   	 
		for(int i = 0; i < ciutatArray1.length; i++){                                                                                  
		    System.out.print(ciutatArray1[i]);     
		}     
	    
		System.out.print(" - ");
		
		for (int j = ciutatArray1.length-1; j>=0; j--) {
			System.out.print(ciutatArray1[j]);
		}
		
		System.out.println("");
		*/
		
		
		char[][] arrays = {ciutatArray1, ciutatArray2, ciutatArray3, ciutatArray4, ciutatArray5, ciutatArray6};
        
		
		 System.out.println("------Inversió!-------");
		
		
        for(char[] arr: arrays) {
            for(char n: arr) {
                System.out.print(n+" ");
            }
            
            System.out.print(" - ");
            
            for (int j = arr.length-1; j>=0; j--) {
        			System.out.print(arr[j] + " ");
            }
  
            System.out.println();
			
        }	
	}
}

