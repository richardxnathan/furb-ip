import java.util.Scanner;

public class Uni3Uri1001 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    int A, B;
    A = teclado.nextInt();
    B = teclado.nextInt();

    // Processo
    int X = A + B;

    // Saída
    System.out.println("X = " + X);

    teclado.close();
  }
}
