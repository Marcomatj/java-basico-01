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

		if(idade > 20) {
		System.out.println("A idade é maior que 20");
		}else {
		System.out.println("A idade é menor que 20");	
		}
		
	}

}

