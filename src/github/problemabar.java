package github;

import java.util.Locale;
import java.util.Scanner;

public class problemabar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cerv,refri,espetinho,valorcerv, valorrefri, valorespet;
		char sexo;
		double valortotal, couvert, valorapagar, ingresso;
		// LEITURA DE DADOS
		
		System.out.printf("Sexo : ");
		sexo = sc.next().charAt(0);
		System.out.printf("Quantidade de cerveja: ");
		cerv = sc.nextInt();
		System.out.printf("Quantidade de refrigerante:");
		refri = sc.nextInt();
		System.out.printf("Quantidade de espetinho: ");
		espetinho = sc.nextInt();
		
		// LEITURA DE DADOS
			valorcerv = cerv * 5;
			valorrefri = refri * 3;
			valorespet = espetinho * 7;
			
			
			if(sexo == 'F' || sexo == 'f') {
				ingresso = 8.0;	
			}
			else {
				ingresso = 10.0;
			}
			valortotal = valorespet + valorrefri + valorcerv;
			if(valortotal > 30) {
				couvert = 0.0;
			}
			else {
				couvert = 4.0;
			}
			valorapagar = valortotal + ingresso + couvert;
			
			// RELATORIO
			
			System.out.println();
			System.out.println("RELATÓRIO:");
			System.out.printf("Consumo = R$ %.2f%n", valortotal);
			if( couvert == 0.0) {
				System.out.println("Isento de Couvert");
			}
			else {
				System.out.printf("Couvert = R$ %.2f%n", couvert);
			}
			System.out.printf("Ingresso = R$ %.2f%n ", ingresso);
			System.out.println();
			
			System.out.printf("Valor a pagar = R$ %.2f%n" , valorapagar);
			
		sc.close();
	}

}
