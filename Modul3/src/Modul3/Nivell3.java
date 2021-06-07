/*
 * Escriviu un programa que donat un numero N retorni la seq��ncia de Fibonacci fins al numero N.
 * La seq��ncia de Fibonacci �s la s�rie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... El n�mero seg�ent es troba sumant els dos n�meros anteriors. 
 */

package Modul3;

import java.util.Scanner;

public class Nivell3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		int limit;
		int a = 0;
		int b =1;
		int c;
		
		
		System.out.println("Bon dia, benvingut a un nou exercici de l'IT");
		System.out.println("Quants números vols de la sèrie de Fibonacci?");
		limit = entrada.nextInt();
		
		System.out.print(a + " " +  b + " ");
		for(int i=1; i < limit-1; i++) {
			System.out.print((a+b) + " ");
			c = (a+b);
			a = b;
			b = c;
		}
		
		entrada.close();
		
	}

}
