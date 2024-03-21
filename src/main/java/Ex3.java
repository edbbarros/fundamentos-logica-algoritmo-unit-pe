public class Ex3 {
  public static void main(String[] args) {
   
    double turnoDiurno = 6;
    double turnoNoturno = 7;
    double valorDiurno = turnoDiurno * 10;
    double valorNoturno = turnoNoturno * 10 * 1.5;

    double valorTotal = valorDiurno + valorNoturno;

      System.out.println("Valor do salário no turno diurno: " + valorDiurno );
      System.out.println("Valor do salário no turno noturno: " + valorNoturno);
      System.out.println("Valor total do salário: " + valorTotal);

  }
}