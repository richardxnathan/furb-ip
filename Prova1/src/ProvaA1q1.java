public class ProvaA1q1 {
  public static void main(String[] args) {
    String nome = "Teste";
    String cidade = "Blumenau";

    if (nome.equals("") && cidade.equals("")) {
      System.out.println("Nome e Cidade");
      System.out.println("Vazio");
    } else {
      System.out.println("Teste Cidade");
      if (cidade.equals("")) {
        System.out.println("Cidade Vazio");
      } else {
        System.out.println("Cidade Cadastrada");
      }
    }
    System.out.println("FIM");
  }
}