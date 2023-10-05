import java.util.Scanner;

public class ProvaA2q2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite as três notas: ");
    double nota1 = teclado.nextDouble();
    double nota2 = teclado.nextDouble();
    double nota3 = teclado.nextDouble();

    double notaBaixa = 0, notaMedia = 0, notaAlta = 0;

    if ((nota1 <= nota2) && (nota1 <= nota3)) {
      notaBaixa = nota1;
      if (nota2 <= nota3) {
        notaMedia = nota2;
        notaAlta = nota3;
      } else {
        notaMedia = nota3;
        notaMedia = nota2;
      }
    } else {
      if ((nota2 <= nota1) && (nota2 <= nota3)) {
        notaBaixa = nota2;
        if (nota1 <= nota3) {
          notaMedia = nota1;
          notaAlta = nota3;
        } else {
          notaMedia = nota3;
          notaAlta = nota1;
        }
      } else {
        notaBaixa = nota3;
        if (nota1 <= nota2) {
          notaMedia = nota1;
          notaAlta = nota2;
        } else {
          notaMedia = nota2;
          notaAlta = nota1;
        }
      }
    }
    notaBaixa += 0.3;
    notaMedia += 0.1;
    notaAlta += 0.2;

    System.out.println("_Menu:");
    System.out.println("a) média simples");
    System.out.println("b) média ponderada");

    char opcao = teclado.next().charAt(0);

    double media;
    switch (opcao) {
      case 'a':
        media = (notaBaixa + notaMedia + notaAlta) / 3;
        System.out.println("O valor da média simples do aluno: " + media);
        break;
      case 'b':
        media = (notaBaixa * 0.2) + (notaMedia * 0.5) + (notaAlta * 0.9);
        System.out.println("O valor da média ponderada do aluno: " + media);
        break;
      default:
        System.out.println("Valor inválido do Menu");
        break;
    }

    teclado.close();
  }
}
