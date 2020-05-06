package github;

import java.util.Locale;
import java.util.Scanner;

public class problemabar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cerv,refri,espetinho;
		char sexo;
		
		System.out.printf("Sexo : ");
		sexo = sc.next().charAt(0);
		System.out.printf("Quantidade de cerveja: ");
		cerv = sc.nextInt();
		System.out.printf("Quantidade de refrigerante:");
		refri = sc.nextInt();
		System.out.printf("Quantidade de espetinho: ");
		espetinho = sc.nextInt();
		
		sc.close();
	}

}
