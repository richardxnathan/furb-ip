public class ProvaC1q1 {
  public static void main(String[] args) {
    String temperatura = "alta";
    String clima = "chuvoso";

    if (temperatura.equals("") && clima.equals("")) {
      System.out.println("Temperatura e Clima");
    } else {
      System.out.println("Teste Clima");
      if (clima.equals("")) {
        System.out.println("Clima Vazio");
        System.out.println("Temperatura Vazia");
      } else {
        System.out.println("Clima Cadastrado");
      }
    }
    System.out.println("Clima PERIGOSO");
  }
}

/*
__ Valores de Testes: 
_ Resposta ___
Teste Clima
Clima Cadastrado
Clima PERIGOSO
*/