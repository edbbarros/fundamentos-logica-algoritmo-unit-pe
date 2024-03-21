/*
Um semáforo muda de estado a cada 27 segundos.
Escreva um programa para receber uma quantidade de minutos e informar a
quantidade de vezes que o semáforo mudou de estado.
*/

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {

    final int DURACAO_ESTADO_SEMAFORO_SEGUNDOS = 27;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a quantidade de minutos:");

    int quantidadeMinutos = scanner.nextInt();
    int duracaoMinutosParaSegundos = quantidadeMinutos * 60;
    int vezesEstadoSemaforoAlterado = duracaoMinutosParaSegundos / DURACAO_ESTADO_SEMAFORO_SEGUNDOS;

    System.out.println("O semáforo mudou de estado " + vezesEstadoSemaforoAlterado + " vezes.");

    scanner.close();
  }
}

