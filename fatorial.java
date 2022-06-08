package exercicios;

import java.util.*;

public class fatorial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int fatorial = 0;
		int inicio = 1;
		
		System.out.println("Insira um número para saber o fatorial: ");
		numero = entrada.nextInt();
		fatorial = numero;
		
		while(inicio < fatorial) {
			numero = numero * inicio;
			inicio++;
		}
		
		System.out.println(numero);
	}
}