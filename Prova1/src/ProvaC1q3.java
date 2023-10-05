import java.util.Scanner;

public class ProvaC1q3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe o tipo de cor: ");
    char tipo = teclado.next().charAt(0);
    tipo = Character.toUpperCase(tipo);
    if (tipo == 'A') {
      System.out.println("Azul");
    } else {
      if (tipo == 'V') {
        System.out.println("Vermelho");
      } else {
        if (tipo == 'P') {
          System.out.println("Preto");
        } else {
          System.out.println("Tipo Incorreto”");
        }
      }
    }
    
    teclado.close();
  }
}
