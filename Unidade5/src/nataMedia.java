import java.util.Scanner;

public class nataMedia {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    double nota, somaNota, media = 0;
    final int qtdALunos = 200;
    final int qtdNotas = 30;

    for (int i = 1; i <= qtdALunos; i++) {
      somaNota = 0;
      System.out.println(" __ ALuno: " + i);
      for (int j = 1; j <= qtdNotas; j++) {
        System.out.print("nota["+ i + "]: ");
        nota = tec.nextDouble();
        somaNota += nota;
      }
      media = somaNota / qtdNotas;
      System.out.println("Média: " + media);
    }

    tec.close();
  }}
