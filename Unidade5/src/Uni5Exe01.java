import java.util.Scanner;

public class Uni5Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero = 0;

    for (int i = 1; i <= 5; i++) { // ATENÇÃO mudar para 20
      System.out.print("Número[" + i + "]: ");
      numero = teclado.nextInt();
      if (numero % 2 == 0) {
        System.out.println("par");
      } else {
        System.out.println("impar");
      }
    }

    teclado.close();
  }
}
