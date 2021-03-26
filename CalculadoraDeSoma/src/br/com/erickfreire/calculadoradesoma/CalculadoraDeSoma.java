package br.com.erickfreire.calculadoradesoma;

import java.util.Scanner;

/**
 * Programa que calcula a soma entre dois valores
 * @author Erick Freire
 * @version 1 - criada em 25-03-2021 as 23:05
 */

public class CalculadoraDeSoma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.print("Informe o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.printf("Soma é %d%n", soma);
		
	}

}
 