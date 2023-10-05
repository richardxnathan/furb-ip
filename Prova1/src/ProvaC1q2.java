import java.util.Scanner;

public class ProvaC1q2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Valor da compra: ");
    double valorCompra = teclado.nextDouble();

    // Menu forma pagamento
    System.out.println("Forma de pagamento:");
    System.out.println(" 1) Débito");
    System.out.println(" 2) Pix");
    System.out.println(" 3) Crediário");    
    int formaPagto = teclado.nextInt();
    double valorPagar = 0;
    switch (formaPagto) {
      case 1: // Débito:
        valorPagar = valorCompra; // não possui desconto
        System.out.println("Valor a ser pago: " + valorPagar); 
        break;
      case 2: // Pix:
        valorPagar = valorCompra - (valorCompra * 0.03); // 3% desconto
        System.out.println("Valor a ser pago: " + valorPagar);
        break;
      case 3: // Crediário
        System.out.print("Quantas vezes deseja pagar: ");
        int qtdParcelas = teclado.nextInt();
        double valorParcela = valorCompra / qtdParcelas;
        System.out.print("Dia de vencimento: ");
        int diaVencimento = teclado.nextInt();
        System.out.print("Dia pagamento: ");
        int diaPagamento = teclado.nextInt();
        int diaAtraso = diaPagamento - diaVencimento;
        if (diaAtraso <= 0) { // até o dia do vencimento
          valorPagar = valorParcela - (valorParcela * 0.1); // 10% desconto
          System.out.println("Valor a ser pago: " + valorPagar);
          System.out.println("Pagamento está em dia.");
        } else {
          if (diaAtraso <= 5) { // até cinco dias após o vencimento
            valorPagar = valorParcela; // não possui desconto
            System.out.println("Valor a ser pago: " + valorPagar); 
          } else {            
            double valorAcrescimoPorDia = valorParcela * 0.02; // 2% multa
            double valorAcrescimo = valorAcrescimoPorDia * diaAtraso;
            valorPagar = valorParcela + valorAcrescimo;
            System.out.println("Valor a ser pago: " + valorPagar);
          }
        }
        break;
      default:
        System.out.println("Opção ERRADA!!");
        break;
    }
    teclado.close();
  }
}

/*
__ Valores de Testes: 
_ Caso Débito: não possui desconto ___
valorCompra: 100,00
formaPagto: 1
--
valorPagar: 100,00

_ Caso Pix: 3% desconto ___
valorCompra: 100,00
formaPagto: 2
--
valorPagar: 97,00

_ Caso Crediário: até pagto, 10% desconto ___
valorCompra: 100,00
formaPagto: 3
qtdParcelas: 5
diaVencimento: 10
diaPagamento: 4
--
valorPagar: 18,00
"Pagamento está em dia"

_ Caso Crediário: até carência, não possui desconto ___
valorCompra: 100,00
formaPagto: 3
qtdParcelas: 5
diaVencimento: 10
diaPagamento: 13
--
valorPagar: 20,00

_ Caso Crediário: depois do prazo, 2% multa ___
valorCompra: 100,00
formaPagto: 3
qtdParcelas: 5
diaVencimento: 10
diaPagamento: 20
--
valorPagar: 24,00

_ Caso Crediário: depois do prazo, 2% multa ___
valorCompra: 100,00
formaPagto: 3
qtdParcelas: 5
diaVencimento: 10
diaPagamento: 25
--
valorPagar: 26,00

*/
