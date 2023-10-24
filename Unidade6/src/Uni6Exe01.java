import java.util.Scanner;
public class Uni6Exe01 {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);    
    int vetor[] = new int[10];
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor["+i+"]: ");
      vetor[i] = tec.nextInt();
    }
    for (int i = vetor.length-1; i >= 0; i--) {
      System.out.print(vetor[i]);
    }
    tec.close();
  }
}
