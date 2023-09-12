public class CaixaAreia {
  public static void main(String[] args) {
    char opcao = 2;
    switch (opcao) {
      case 2:
        System.out.println("2");
        break;
      case 1:
        System.out.println("1");
        break;
      case 99:
        System.out.println("99");
        break;
      default:
        System.out.println("outros");
        break;
    }

    int numero = 5;
    if (numero >= 0 && numero <= 10 || numero >= 20 && numero <= 30) {
      System.out.println("ok");
    }

    char letra = 'c';
    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
      System.out.println("vogal");
    }

  }
}
