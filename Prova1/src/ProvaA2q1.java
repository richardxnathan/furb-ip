public class ProvaA2q1 {
  public static void main(String[] args) {
    String nome = "Teste";
    String pais = "Brasil";

    if (nome.equals("") && pais.equals("")) {
      System.out.println("Nome e Pais");
      System.out.println("Vazio");
    } else {
      System.out.println("Teste Pais");
      if (pais.equals("")) {
        System.out.println("Pais Vazio");
      } else {
        System.out.println("Pais Cadastrado");
      }
    }
    System.out.println("Acabei");
  }
}
