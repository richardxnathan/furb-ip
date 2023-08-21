import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
    
    // Entrada
    System.out.print("Informe valor do par de sapato: ");
    double sapatoValor = teclado.nextDouble();

    // Processo
    double sapatoDesconto;
    sapatoDesconto = sapatoValor * 0.12; // 12% de desconto
    double sapatoLiquido = sapatoValor - sapatoDesconto;

    // Saída
    System.out.println("O valor do desconto é de R$ " + df_2.format(sapatoDesconto));
    System.out.println("O preço do par de sapatos com desconto é R$ " + df_2.format(sapatoLiquido));    

    teclado.close();
  }
}
