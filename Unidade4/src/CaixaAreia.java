public class CaixaAreia {
  public static void main(String[] args) {
    String textoUm = "aula";
    String textoDois = "aula";

    if (textoUm == textoDois) {
      System.out.println("1");
    }

    textoDois = textoDois + "";
    System.out.println(textoDois);

    if (textoUm == textoDois) {
      System.out.println("2");
    }
    if (textoUm.equals(textoDois)) {
      System.out.println("3");
    }

  }
}
