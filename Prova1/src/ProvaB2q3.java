import java.util.Scanner;

public class ProvaB2q3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe o tipo de sangue: ");
    char tipo = teclado.next().charAt(0);
    tipo = Character.toUpperCase(tipo);
    if (tipo == 'A') {
      System.out.println("Vermelho");
    } else {
      if (tipo == 'B') {
        System.out.println("Azul");
      } else {
        if (tipo == 'O') {
          System.out.println("Universal");
        } else {
          System.out.println("Tipo Inconsistente”");
        }
      }
    }
    
    teclado.close();
  }
}
