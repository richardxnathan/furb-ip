import java.util.Scanner;

public class Uni3Exe01 {
  public static void main(String[] args) {
    // Dados
    Scanner teclado = new Scanner(System.in);
    double altura;
    double largura;
    double area;
    int areaInt;

    // Entrada
    System.out.print("Altura: ");
    altura = teclado.nextDouble();
    System.out.print("Largura: ");
    largura = teclado.nextDouble();

    // Processo
    area = altura * largura;

    // Saída
    System.out.print("Área do terreno: " + area);
    teclado.close();
  }
}
