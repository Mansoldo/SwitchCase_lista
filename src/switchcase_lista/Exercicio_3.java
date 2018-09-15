/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase_lista;

import java.util.Scanner;

/**
 *
 * @author diego.amalmeida
 */
public class Exercicio_3 {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		int qtdNota100 = 0;
		int qtdNota50 = 0;
		int valor = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor: ");
		valor = entrada.nextInt();

		switch (valor % 100) {
		case (0):

			qtdNota100 = valor / 100;
			break;

		default:
			qtdNota100 = valor / 100;
			valor = valor % 100;

			break;
		}
		switch (valor % 50) {
		case (0):
			qtdNota50 = valor / 50;
			break;

		default:
			qtdNota50 = valor / 50;
			valor = valor % 50;
			break;

		}
		entrada.close();

		System.out.println("Quantidade de notas de 100: " + qtdNota100);
		System.out.println("Quantidade de notas de 50: " + qtdNota50);
	}

}
