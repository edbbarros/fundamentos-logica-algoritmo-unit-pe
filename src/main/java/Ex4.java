/*
Escreva um programa para receber a quantidade de dias que um aluno atrasou a devolução de um livro e mostrar o total da multa, sabendo-se que por cada dia de atraso é cobrado R$ 1,80.
*/

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args ) {
    final double TAXA_MULTA_POR_DIA = 1.80;

    Scanner scan = new Scanner(System.in);
    System.out.println("Quantidade de dias atrasados?");

    int diasAtrasados = scan.nextInt();
    double multa = diasAtrasados * TAXA_MULTA_POR_DIA;

    System.out.println("O atraso na entrega é de " + diasAtrasados + " dias." + " A multa a ser paga é de R$" + multa);

    scan.close();
    }
  }
  

