package br.fai.projeto01;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		
		int idade = 15;
		
		System.out.println("A idade e de " + idade+ " anos");
		System.out.println("Resultado 1: " +((idade + 5)*2));
		System.out.println("Resultado 2: " +(idade - 5));
		
	}

}

