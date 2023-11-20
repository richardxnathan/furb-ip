public class ExemploMatrizPesquisa {

  private ExemploMatrizPesquisa() {
    final int qtdLinha = 3; // linha
    final int qtdColuna = 5; // coluna
    int matriz[][] = new int[qtdLinha][qtdColuna];

    matrizZeros(matriz, qtdLinha, qtdColuna);

    int valor = 20;
    matriz[1][3] = valor;
    if (!matrizPesquisa(matriz, qtdLinha, qtdColuna, valor)) {
      System.out.println("não achou");
    }
  }

  private void matrizZeros(int matriz[][], int qtdLinha, int qtdColuna) {
    for (int l = 0; l < qtdLinha; l++) {
      for (int c = 0; c < qtdColuna; c++) {
        matriz[l][c] = 0;
      }
    }
  }

  private boolean matrizPesquisa(int matriz[][], int qtdLinha, int qtdColuna, int valorPesquisa) {
    for (int l = 0; l < qtdLinha; l++) {
      for (int c = 0; c < qtdColuna; c++) {
        if (matriz[l][c] == valorPesquisa) {
          System.out.println("[" + l + "][" + c + "]");
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    new ExemploMatrizPesquisa(); // chamar método contrutor.
  }
}
