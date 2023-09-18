import java.util.Scanner;

public class CalculadoraIf {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Termo1: ");
    double termo1 = teclado.nextDouble();
    System.out.println("operador: ");
    char operador = teclado.next().charAt(0);
    System.out.println("Termo2: ");
    double termo2 = teclado.nextDouble();

    // Processo: condicional (+ - * /)
    double resultado = 0;
    boolean naoDivZero = true;
    if (operador == '+') {
      resultado = termo1 + termo2;
    }
    if (operador == '-') {
      resultado = termo1 - termo2;
    }
    if (operador == '*') {
      resultado = termo1 * termo2;
    }
    if (operador == '/') {
      if (termo2 != 0) {
        resultado = termo1 / termo2;
      } else { // termo2 == 0
        System.out.println("Não dividir por zero");
        naoDivZero = false;
      }
    }
    if (operador != '+' &&
        operador != '-' &&
        operador != '/' &&
        operador != '*') {
      System.out.println("operador errado!!");
      naoDivZero = false;
    }

    // Saída
    if (naoDivZero) {
      System.out.println("Resultado = " + resultado);
    }

    teclado.close();
  }
}
