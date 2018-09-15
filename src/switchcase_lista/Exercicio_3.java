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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qtdNota100 = 0;
        int qtdNota50 = 0;
        int qtdNota20 = 0;
        int qtdNota10 = 0;
        int qtdNota5 = 0;
        int qtdNota1 = 0;
        int valor = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        valor = entrada.nextInt();

        switch (valor % 100) {
            case (0):

                qtdNota100 = valor / 100;
                valor = valor % 100;

                break;

            default:
                qtdNota100 = valor / 100;
                valor = valor % 100;

                break;
        }
        switch (valor) {
            case 0:
                break;

            default:

                switch (valor % 50) {
                    case (0):
                        qtdNota50 = valor / 50;
                        valor = valor % 50;

                        break;

                    default:
                        qtdNota50 = valor / 50;
                        valor = valor % 50;

                        break;
                }
                switch (valor) {
                    case 0:
                        break;

                    default:
                        switch (valor % 20) {
                            case (0):
                                qtdNota20 = valor / 20;
                                valor = valor % 20;

                                break;

                            default:
                                qtdNota20 = valor / 20;
                                valor = valor % 20;

                                break;
                        }

                }
                switch (valor) {
                    case 0:
                        break;

                    default:
                        switch (valor % 10) {
                            case (0):
                                qtdNota10 = valor / 10;
                                valor = valor % 10;

                                break;

                            default:
                                qtdNota10 = valor / 10;
                                valor = valor % 10;

                                break;
                        }

                }
                switch (valor) {
                    case 0:
                        break;

                    default:
                        switch (valor % 5) {
                            case (0):
                                qtdNota5 = valor / 5;
                                valor = valor % 5;

                                break;

                            default:
                                qtdNota5 = valor / 5;
                                valor = valor % 5;

                                break;
                        }

                }
                switch (valor) {
                    case 0:
                        break;

                    default:
                        switch (valor % 1) {
                            case (0):
                                qtdNota1 = valor / 1;
                                valor = valor % 1;

                                break;

                            default:
                                qtdNota1 = valor / 1;
                                valor = valor % 1;

                                break;
                        }

                }
        }
        switch (qtdNota100) {
            case 0:
                break;
            default:
                System.out.println("Quantidade de notas de 100: " + qtdNota100);
        }
        switch (qtdNota50) {
            case 0:
                break;
            default:
                System.out.println("Quantidade de notas de 50: " + qtdNota50);
        }
        switch (qtdNota20) {
            case 0:
                break;
            default:
                System.out.println("Quantidade de notas de 20: " + qtdNota20);
        }
        switch (qtdNota10) {
            case 0:
                break;
            default:
                System.out.println("Quantidade de notas de 10: " + qtdNota10);
        }
        switch (qtdNota5) {
            case 0:
                break;
            default:
                System.out.println("Quantidade de notas de 5: " + qtdNota5);
        }
        switch (qtdNota1) {
            case 0:
                break;
            default:
                System.out.println("Quantidade de notas de 1: " + qtdNota1);
        }

        entrada.close();

        // Noel é baitolão e gosta de ficar pendurado no peru do marretinha de mel...
    }

}
