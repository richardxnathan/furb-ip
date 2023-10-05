import java.util.Scanner;

public class ProvaA2q3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe o código: ");
    char tipo = teclado.next().charAt(0);
    tipo = Character.toUpperCase(tipo);
    if (tipo == 'X') {
      System.out.println("Porsche");
    } else {
      if (tipo == 'Y') {
        System.out.println("Fusca");
      } else {
        if (tipo == 'Z') {
          System.out.println("Gol");
        } else {
          System.out.println("Entrada Inválida");
        }
      }
    }
    
    teclado.close();
  }
}
