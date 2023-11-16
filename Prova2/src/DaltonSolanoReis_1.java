import java.util.Scanner;

public class DaltonSolanoReis_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int votoOpcao, votoChapa1 = 0, votoChapa2 = 0, votoNulo = 0, votoTotal = 0;

    do {
      System.out.println("_____ Eleições _____");
      System.out.println("1 - Voto Chapa1");
      System.out.println("2 - Voto Chapa2");
      System.out.println("3 - Voto Nulo");
      System.out.println("0 - Encerrar votação");
      System.out.print("__ opção: ");
      votoOpcao = teclado.nextInt();

      switch (votoOpcao) {
        case 1:
          votoChapa1++;
          break;
        case 2:
          votoChapa2++;
          break;
        case 3:
          votoNulo++;
          break;
        case 0:
          break;
        default:
          System.out.println("Opção errada");
          break;
      }
    } while (votoOpcao != 0);
    votoTotal = votoChapa1 + votoChapa2 + votoNulo;
    System.out.println("Votos Chapa1: " + votoChapa1);
    System.out.println("Votos Chapa2: " + votoChapa2);
    System.out.println("Votos Nulos: " + votoNulo);
    System.out.println("Total votos: " + votoTotal);

    teclado.close();
  }
}