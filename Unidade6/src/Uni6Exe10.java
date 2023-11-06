import java.util.Scanner;

public class Uni6Exe10 {
  public Uni6Exe10() {
    Scanner teclado = new Scanner(System.in);
    int vetor[] = new int[50];
    int vetorQtdEle = 0;
    // FIXME:
    vetor[0] = 100;
    vetor[1] = 200;
    vetor[2] = 300;
    vetor[3] = 400;
    vetorQtdEle = 4;

    int opcao;

    do {
      System.out.print("Opção: ");
      opcao = teclado.nextInt();
      switch (opcao) {
        case 1: // Incluir valor
          vetorQtdEle = vetorIncluir(vetor, vetorQtdEle, teclado);
          break;
        case 2: // Pesquisar valor
          vetorPesquisar(vetor, vetorQtdEle, teclado);
          break;
        case 3: // Alterar valor
          vetorAlterar(vetor, vetorQtdEle, teclado);
          break;
        case 4: // Excluir valor
          vetorExcluir();
          break;
        case 5: // Mostrar valores
          vetorMostrar(vetor, vetorQtdEle);
          break;
        case 6: // Ordenar valores
          vetorOrdenar();
          break;
        case 7: // Inverter valores
          vetorInverter();
          break;
        case 8: // Sair do sistema
          System.out.println("_FIM_");
          break;
        default:
          System.out.println("Opção do menu ERRADA.");
          break;
      }
    } while (opcao != 8);

    teclado.close();
  }

  public int vetorIncluir(int vetor[], int vetorQtdEle, Scanner teclado) {
    if (vetorQtdEle < vetor.length) {
      System.out.print("Valor: ");
      vetor[vetorQtdEle] = teclado.nextInt();
      vetorQtdEle++;
    } else {
      System.out.println("Vetor CHEIO!!");
    }
    return vetorQtdEle;
  }

  public int vetorPesquisar(int vetor[], int vetorQtdEle, Scanner teclado) { // Fazer este !!
    System.out.println("Valor pesquisar: ");
    int valorPesquisar = teclado.nextInt();
    int indEncontrou = -1;
    for (int i = 0; i < vetorQtdEle; i++) {
      if (vetor[i] == valorPesquisar) {
        indEncontrou = i;
      }
    }
    if (indEncontrou == -1) {
      System.out.println("Não encontrei o valor");
    } else {
      System.out.println("Encontrei o valor");
    }
    return indEncontrou;
  }

  public void vetorAlterar(int vetor[], int vetorQtdEle, Scanner teclado) { // Fazer este !!
    int indencontrou = vetorPesquisar(vetor, vetorQtdEle, teclado);
    int valorSubstituir;
    if (indencontrou != -1) {
      System.out.println("Valor alterar: ");
      valorSubstituir = teclado.nextInt();
      vetor[indencontrou] = valorSubstituir;
    }
  }

  public void vetorExcluir() {
  }

  public void vetorMostrar(int vetor[], int vetorQtdEle) {
    if (vetorQtdEle == 0) {
      System.out.println("Vetor vazio!!");
    }
    for (int i = 0; i < vetorQtdEle; i++) {
      System.out.println("Vetor[" + i + "]: " + vetor[i]);
    }
  }

  public void vetorOrdenar() {

  }

  public void vetorInverter() {

  }

  public static void main(String[] args) {
    new Uni6Exe10();
  }
}
