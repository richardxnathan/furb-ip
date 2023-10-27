import java.util.Scanner;

public class Uni6Exe01metodo {

  private Uni6Exe01metodo() {
    int vetor[] = new int[10];

    for (int i = 0; i < 20; i++) {
      vetorLer(vetor);
      vertorEscrever(vetor);
    }

  }

  private void vetorLer(int vetor[]) {
    Scanner tec = new Scanner(System.in);
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor[" + i + "]: ");
      vetor[i] = tec.nextInt();
    }
    tec.close();
  }

  private void vertorEscrever(int vetor[]) {
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.print("bla: " + vetor[i]);
    }

  }

  public static void main(String[] args) {
    new Uni6Exe01metodo();

  }

}
