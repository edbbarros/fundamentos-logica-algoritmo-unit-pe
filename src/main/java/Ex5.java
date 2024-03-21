/*

Uma balsa que transporta apenas veiculo do tipo passeio cobra R$ 10,00 para transportar um veículo e R$ 2,00 para transportar cada ocupante do veículo.

Escreva um programa para receber a quantidade de pessoas que estão ocupando um determinado veículo e calcular e mostrar:

O valor do transporte das pessoas
O valor total do transporte

*/

import java.util.Scanner;

public class Ex5 {
  public static void main (String[] args){

    final double VALOR_VEICULO = 10.00;
    final double VALOR_PESSOAS = 2.00;

      Scanner scan = new Scanner(System.in);
      System.out.println("Quantidade de pessoas no veiculo?");

      double passageirosNoVeiculo = scan.nextDouble();
      double valorTransportePessoas = passageirosNoVeiculo * VALOR_PESSOAS; 
      double valorTotalTransporte = valorTransportePessoas + VALOR_VEICULO; 

      System.out.println("O valor total a ser pago é de: " + valorTotalTransporte);

        scan.close();
  }
}
