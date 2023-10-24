import java.util.Scanner;

public class Uni6Exe06 {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.print("vetor tamanho: ");
    final int vetTamanho = tec.nextInt();
    double vetor[] = new double[vetTamanho];

    // Leitura do vetor
    for (int i = 0; i < vetTamanho; i++) {
      System.out.print("vetor[" + i + "]: ");
      vetor[i] = tec.nextDouble();
    }

    // Pesquisa no vetor
    System.out.print("Valor pesquisa: ");
    final double valorPesquisa = tec.nextDouble();
    for (int i = 0; i < vetTamanho; i++) {
      if (valorPesquisa == vetor[i]) {
        System.out.println("Encontrou na posição [" + i + "].");
        break;
      }
    }
    tec.close();
  }
}
