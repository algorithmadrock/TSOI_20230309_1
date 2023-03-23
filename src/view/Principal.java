/*
RESUMO      : Exercicio 1, método principal que faz a chamada da thread
PROGRAMADORA: Luiza Felix
DATA        : 09/03/2023
 */

package view;

import controller.TID;

public class Principal {

	public static void main(String[] args) {
		
		for (int i = 1; i<=5; i++) {
			Thread thread = new TID(i);
			thread.start();
		}

	}

}
