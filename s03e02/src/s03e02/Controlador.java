package s03e02;

import java.util.Scanner;

class Peixe {
		int barriga = 0;
		int maxBarriga = 5;
		void alimentar(int qtd) {
			barriga += qtd;
			System.out.println("hmmmmmmmmmm");
		}
		void esperar(int qtd) {
			barriga-= qtd;
			System.out.println("ahhhhhhhhhh");
		}
		void status() {
			System.out.println("seu peixe esta: ");
		}
}
public class Controlador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Peixe marlin = new Peixe();
		marlin.maxBarriga = 10;
		System.out.println ("Digite alimentar ou esperar");
		while (true) {
			String line = scanner.nextLine();
			String [] vet = line.split(" ");
			
			if (vet[0].equals("alimentar")) {
				int qtd =  scanner.nextInt();
				marlin.alimentar(Integer.parseInt(vet[1]));
			}
			else if (vet[0].equals("esperar"))
				marlin.esperar();
			else if (vet[0].equals("status"))
				marlin.status();
			else if (vet[0].equals("end"))
				break;
		}
		
	}

}
