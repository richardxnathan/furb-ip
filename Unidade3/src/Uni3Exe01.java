/*
Uma imobiliária vende apenas terrenos retangulares. 
Faça um programa para ler as dimensões de um 
terreno e depois exibir a área do terreno.
---
altura: 10
largura: 2
area: 20

altura: 3
largura: 7
area: 21

Entrada
Ler(altura)
Ler(largura)

Processo
Area = altura x largura

Saída
Imprimir(area)

*/

import java.util.Scanner;

public class Uni3Exe01 {
  public static void main(String[] args) {
    // Dados
    Scanner teclado = new Scanner(System.in);
    int altura;
    int largura;
    int area;

    // Entrada
    System.out.print("Altura: ");
    altura = teclado.nextInt();
    System.out.print("Largura: ");
    largura = teclado.nextInt();

    // Processo
    area = altura * largura;

    // Saída
    System.out.print("Área do terreno: " + area);
    teclado.close();
  }
}
