public class ProvaB2q1 {
  public static void main(String[] args) {
    String animal = "Vertebrado";
    String especie = "Extinção";

    if (animal.equals("") && especie.equals("")) {
      System.out.println("Animal e Espécie");
    } else {
      System.out.println("Teste Espécie");
      if (especie.equals("")) {
        System.out.println("Espécie Vazio");
        System.out.println("Aninmal Vazio");
      } else {
        System.out.println("Espécie Cadastrada");
      }
    }
    System.out.println("Outra Espécie");
  }
}
