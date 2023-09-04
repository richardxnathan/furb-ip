import java.util.Scanner;

public class Uni4Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double horasMes, horasValor, salarioTotal, salarioExtra;

    System.out.println("Entre com as horas trabalhadas no mês: ");
    horasMes = teclado.nextDouble();
    System.out.println("Entre com o valor pago por hora: ");
    horasValor = teclado.nextDouble();
    salarioTotal = horasMes * horasValor;
    if (horasMes > 160) {
      salarioExtra = (horasMes - 160) * (horasValor / 2);
      salarioTotal = salarioTotal + salarioExtra;
    }
    System.out.println("O salário total é: " + salarioTotal);

    teclado.close();
  }
}
