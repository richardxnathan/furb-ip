import java.util.Scanner;

public class ProvaA1q3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe o código: ");
    char tipo = teclado.next().charAt(0);
    tipo = Character.toUpperCase(tipo);
    if (tipo == 'A') {
      System.out.println("Fusca");
    } else {
      if (tipo == 'B') {
        System.out.println("Porsche");
      } else {
        if (tipo == 'C') {
          System.out.println("Gol");
        } else {
          System.out.println("Entrada Incorreta");
        }
      }
    }
    
    teclado.close();
  }
}
