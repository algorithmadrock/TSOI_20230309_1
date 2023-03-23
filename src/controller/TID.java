/*
RESUMO      : Exercicio 1, thread padrão que exibe seu número
PROGRAMADORA: Luiza Felix
DATA        : 09/03/2023
 */

package controller;

public class TID extends Thread{
	
	private int id; 
	
	public TID(int ID_Thread) {
		this.id = ID_Thread;
	}
	
	@Override
	public void run() {
		System.out.println("#TID " + getId() + ": " +id);
	}

}
