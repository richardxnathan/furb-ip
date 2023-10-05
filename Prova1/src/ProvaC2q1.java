public class ProvaC2q1 {
  public static void main(String[] args) {
    String nivel = "alto";
    String altura = "certa";

    if (nivel.equals("") && altura.equals("")) {
      System.out.println("Nível e Altura");
    } else {
      System.out.println("Teste Altura");
      if (altura.equals("")) {
        System.out.println("Altura Vazio");
        System.out.println("Nível Vazio");
      } else {
        System.out.println("Altura Cadastrada");
      }
    }
    System.out.println("Outro Nível");
  }
}

/*
__ Valores de Testes: 
_ Resposta ___
Teste Altura
Altura Cadastrada
Outro Nível
*/