import java.util.Scanner;

public class ProvaC2q3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe o tipo de cor: ");
    char tipo = teclado.next().charAt(0);
    tipo = Character.toUpperCase(tipo);
    if (tipo == 'V') {
      System.out.println("Verde");
    } else {
      if (tipo == 'A') {
        System.out.println("Azul");
      } else {
        if (tipo == 'B') {
          System.out.println("Branco");
        } else {
          System.out.println("Tipo Incorreto”");
        }
      }
    }
    
    teclado.close();
  }
}
