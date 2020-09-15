package view;

import controller.imprimeNumeros;

public class Principal {

	public static void main(String[] args) {
		imprimeNumeros thread1 = new imprimeNumeros("thread-1 ");
		imprimeNumeros thread2 = new imprimeNumeros("thread-2 ");
		imprimeNumeros thread3 = new imprimeNumeros("thread-3 ");
		imprimeNumeros thread4 = new imprimeNumeros("thread-4 ");
		imprimeNumeros thread5 = new imprimeNumeros("thread-5 ");
		
	}

}
