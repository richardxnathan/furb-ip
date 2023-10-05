# Prova de Introdução à Programação  

Assim que receber a prova **leia com muita atenção** as observações no final da prova.  
ATENÇÃO: não é permitido o uso do smartphone durante a aula, nem mesmo para fotografar a prova.

## Questão 1 (2,5)

Para esta questão se pede para desenvolver o programa em Java.  

Ao se considerar que um problema já foi resolvido e descrito no fluxograma abaixo, implemente o seu código em Java usando o VSCode (ou o editor da sua escolha). Esta implementação deve seguir **fielmente** o que está representado neste diagrama. Caso acha alguma diferença do seu código fonte para o Fluxograma será descontado 0,5 por erro cometido.  

![Fluxograma](../svg/ProvaA/ProvaA1q1.svg  "Fluxograma")  

----  
----  
----  
----  
----  

## Questão 2 (4,0)

Para esta questão se pede para desenvolver o programa em Java (pesos: entrada 0,5, saída 0,5, menu 1,0, ordenação 1,0 e calculo da média 1,0).  

Um professor precisa calcular a média final de um aluno, e para este aluno se tem três notas. Cada nota é sempre diferente uma da outra (não precisa consistir se são diferentes, sempre será digitado notas diferentes). Mas as notas podem ser informadas em qualquer ordem de entrada. Após ser informado cada nota elas devem ser ordenadas, pois elas receberão um acréscimo diferente, por exemplo:  

    notaBaixa (a nota mais baixa) se    soma 0,1  
    notaMedia (a nota do meio)    se    soma 0,2  
    notaAlta  (a nota mais alta)  se    soma 0,3  

Após somar estes pontos nas respectivas notas, se deve calcular a média da nota deste aluno. Mas para isto se tem um Menu com as opções (menu deve usar o comando "switch" em vez de "if/else"):  

    _Menu:  
    a) média simples  
    b) média ponderada  

Por exemplo, se as notas após receberem o seu acréscimo forem: 7,0; 8,5 e 9,0. As médias seriam calculadas assim:  

    média simples     (7,0 + 8,5 + 9,0) / 3  
    média ponderada   (7,0 * 0,5) + (8,5 * 0,5) + (9,0 * 0,9)  

Observe que no caso da média ponderada os pesos foram:  

    notaBaixa -> 0,5  
    notaMedia -> 0,5  
    notaAlta  -> 0,9  

As únicas mensagens que devem aparecer são (atenção, estas mensagens não estão na ordem certa, coloque elas na ordem certa no seu código):  

    _Menu:  
    O valor da média simples do aluno:  
    b) média ponderada  
    Valor inválido do Menu  
    a) média simples  
    Digite as três notas:  
    O valor da média ponderada do aluno:  

Os únicos valores a serem digitados são as três notas do aluno e a opção escolhida no Menu. Lembre que a média calculada para o aluno deve aparecer junto com uma das mensagens descritas acima (e não precisa tratar com quantas casas decimais vai aparecer). A média final do aluno pode passar de 10,0, não precisando tratar está situação.  

## Questão 3 (3,5)

Para esta questão primeiro se pede para fazer o Fluxograma que represente a resolução do problema (desenhar no verso da outra folha da prova) e depois se desenvolva o programa em Java (pesos: fluxograma 2,0 e código fonte 1,5).  

Uma empresa codificou seu carros por um código de letra, no caso:  

| código | nome do carro |  
|:------:|:--------------|  
| A      | Fusca         |  
| B      | Porsche       |  
| C      | Gol           |  

Faça com que se leia o código, e dependendo de qual código for se escreva o nome do carro correspondente.  
Qualquer outro código digitado escreva “Entrada Incorreta”.  
Atenção: antes de testar a letra, converta-a para maiúscula. Não é para se usar o comando ```Switch``` (Java).  

## Observações  

- a prova é individual e com consulta ao seu próprio material; respostas iguais serão anuladas;  
- lembre que a interpretação do enunciado faz parte da avaliação destas questões;  
- a prova deve ser desenvolvida durante o período desta aula, e entregue até no máximo o final da aula. Lembre-se que tens que postar as respostas no AVA3, então separe uns 15 minutos antes do termino da prova para fazer este processo. Caso a prova não seja entregue neste período a nota será zero. Assim, mesmo que não tenha terminado a prova providencie a sua entrega antes do final deste prazo;  
- só é permitido o uso de comandos estudados em aula até o momento, envolvendo o conteúdo das unidades 1,2,3 e 4;  
- o arquivo .java deverá ser entregue através do “AVA3”. Para isso siga as instruções abaixo:  
  - abra o AVA3 na disciplina de Introdução à Programação;  
  - clique na opção “Conteúdo” e, em seguida, selecione a opção “Unidade4_RespostasProva”;  
  - adicione os arquivos .java da sua prova;
- Boa prova!  

**ATENÇÃO**: antes de sair da aula deves entregar a folha da prova assinada. Neste momento o professor vai confirmar contigo a entrega da prova no AVA3.  

FURB - Universidade Regional de Blumenau  
Aluno:  
Assinatura:  
