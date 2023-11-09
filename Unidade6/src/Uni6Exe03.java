import java.util.Scanner;

public class Uni6Exe03 {
  private Uni6Exe03() {
    Scanner teclado = new Scanner(System.in);
    double vetor[] = new double[12];

    vetLer(teclado, vetor);
    vetAjustar(vetor);
    vetEscrever(vetor);
    teclado.close();
  }

  private void vetLer(Scanner teclado, double vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Vet[" + i + "]: ");
      vetor[i] = teclado.nextDouble();
    }
  }

  private void vetAjustar(double vetor[]) {
    for (int i = 0; i < vetor.length; i+=2) { //par
      vetor[i] += vetor[i] * 0.02;
    }
    for (int i = 1; i < vetor.length; i+=2) { //ímpar
      vetor[i] += vetor[i] * 0.05;
    }
  }

  private void vetEscrever(double vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Vet[" + i + "]: " + vetor[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe03();
  }
}
