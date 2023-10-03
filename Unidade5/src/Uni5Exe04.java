public class Uni5Exe04 {
  public static void main(String[] args) {
    double numerador = 3;
    double denominador = 2;
    double acumulador = 2;
    double soma = 0;
    int somaNum = 0;
    int somaDen = 0;
    
    for (int i = 1; i <= 20; i++) {
      soma = soma + ( numerador / denominador);

      //numerador
      // System.out.println("numerador: " + numerador);
      // somaNum += numerador;
      numerador += 2;
      
      //denominador
      // System.out.println("denominador: " + denominador);
      // somaDen += denominador;
      acumulador += 2;
      denominador += acumulador;
    }
    // System.out.println(somaDen);
    System.out.println("Soma: " + soma);
  }
}
