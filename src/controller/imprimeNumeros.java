package controller;

public class imprimeNumeros extends Thread {
	
	String nome;
	public imprimeNumeros (String nome) {
		this.nome = nome;
		start();
	}

	public void run() {
		long id = getId();
		System.out.println(nome + "ID - " + id);

	}

}
