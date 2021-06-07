
package Modul3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Nivell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double [][] notesAlumnes = new double [5][4];
		boolean condicio = false;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Introdueix les notes del 0 al 10 de l'alumne " + (i+1));
			for (int j = 0; j < 3; j++) {
				do {
					System.out.println("De l'exàmen " + (j+1));
					double notesVerificacio = entrada.nextDouble();
					
						if (notesVerificacio >= 0 && notesVerificacio <= 10) {
							notesAlumnes[i][j] = notesVerificacio;
							condicio = true;
						}else {
							System.out.println("Has d'introduir un valor vàlid del 0 al 10");
							condicio = false;
						}
					}while(condicio ==false);
		
			}
		}
		
		double suma = 0;
			
		for(int k = 0; k < 5; k++) {
					
			for (int l = 0; l < 3; l++) {
				suma+=notesAlumnes[k][l];
			}
				double mitja = suma/3;
				notesAlumnes[k][3] = mitja;
				suma = 0;
			}
			
		
		
		DecimalFormat df = new DecimalFormat("#.00");
						
		for (int m = 0; m < 5; m++) {
			System.out.println("Resultats per l'alumne " + (m+1));
			if (notesAlumnes[m][3] < 5) {
				System.out.println("Malament, tens de mitja un " + df.format(notesAlumnes[m][3]) + "  has suspès");
			}else {
				System.out.println("Felicitats, has aprovat, tens de mitja un " + df.format(notesAlumnes[m][3]) + ", bon estiu!");
			}
		}
		
		entrada.close();
	}

}
