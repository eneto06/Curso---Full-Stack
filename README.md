# Exercicios propostos do curso FullStack

### Aqui se pode visualizar o enunciado dos problemas que estão resolvidos em JAVA.

####  Questão 9: Duração de Evento

Faça um programa que receba via teclado o tempo de duração de um evento em
uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e
mostre-o expresso em horas, minutos e segundos.

**Entrada**

O arquivo de entrada contém valores com inteiros (int) referente a quantidade de
segundos informada.

**Saída**

Imprima a conversão realizada em HH (horas), MM (minutos) e Segundos (SS).

#### Questão 12: Classificação de Animais

Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível
segundo o esquema abaixo, da esquerda para a direita. Em seguida conclua qual
dos animais seguintes foi escolhido, através das três palavras fornecidas.

**As opções são:** 

vertebrado - ave (carnívoro - águia ou onívoro - pombo) **ou** mamífero (onívoro - homem ou herbívoro - vaca)
invertebrado - inseto (hematofago - pulga ou herbívoro - lagarta) **ou** anelídeo (hematofago - sanguessuga ou onívoro - minhoca)

**Entrada**

A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o
animal segundo a figura acima, com todas as letras minúsculas.

**Saída**

Imprima o nome do animal correspondente à entrada fornecida.

#### Questão 19: Reajuste de Salário

Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder
aumentos salariais a seus funcionários. Aqueles com salário superior a R$500, terão
aumento de 10%, enquanto os que ganham mais de R$300 terão aumento de 7%. Os
demais funcionários terão aumento de apenas 5%. Escreva um programa que
receba como entrada o salário atual de um funcionário, calcule e exiba o valor de
seu novo salário já com o aumento concedido

**Entrada**

Você receberá um único número com dupla precisão.

**Saída**

Você deve imprimir o número também com dupla precisão com resultado do processamento.

#### Questão 20: Desconto em Conta de Energia

A ELETROSHOCK S.A. é uma empresa de distribuição de energia bastante justa
(pelo menos ela se diz ser!). Ela faz cobrança proporcional com a renda da família e
do bairro. O programa deve imprimir uma mensagem de erro caso o bairro digitado
seja inválido. Além disso, caso a renda da pessoa caia fora das faixas da tabela,
não haverá desconto. Se a renda OU o consumo forem valores negativos, deve ser
emitida uma mensagem de erro.
O programa deve ler o código do bairro (S: Santa Ana; I: Industriários; T:
Tabatinga), a renda da família e o consumo em reais e obter o desconto de acordo
com atabela abaixo:

**Entrada**
Um caractere que indica o bairro do cliente (Santa Ana, Industriários, Tabatinga), o
valor da renda do usuário e seu consumo energético em reais.

**Saída**
Quantoapessoavaipagar jácomodesconto.Casoarendadapessoacaiafora
dasfaixasdatabela,nãohaverádesconto.

#### Questão 22: Cálculo de Conta de Água

 A empresa local de abastecimento de água, a Saneamento Básico da Cidade (SBC),
 está promovendo uma campanha de conservação de água, distribuindo cartilhas e
 promovendo ações demonstrando a importância da água para a vida e para o meio
 ambiente. Para incentivar mais ainda a economia de água, a SBC alterou os preços
 de seu fornecimento de forma que, proporcionalmente, aqueles clientes que
 consumirem menos água paguem menos pelo metro cúbico.
 Todo cliente paga mensalmente uma assinatura de R$ 7, que inclui uma franquia de
 10 m3 de água. Isto é, para qualquer consumo entre 0 e 10 m3, o consumidor paga a
 mesma quantia de R$ 7 reais (note que o valor da assinatura deve ser pago mesmo
 que o consumidor não tenha consumido água). Acima de 10 m3, cada metro cúbico
 subsequente tem um valor diferente, dependendo da faixa de consumo. A SBC
 cobra apenas por quantidades inteiras de metros cúbicos consumidos. A tabela
 abaixo especifica o preço por metro cúbico para cada faixa de consumo:

Assim, por exemplo, se o consumo foi de 120 m3, o valor da conta é:
 ● 7reais daassinatura básica;
 ● 20reais pelo consumo no intervalo 11 — 30 m3;
 ● 140reais pelo consumo no intervalo 31 — 100 m3;
 ● 100reais pelo consumo no intervalo 101 — 120 m3.
 Logo, o valor total da conta de água é R$ 267.

 Escreva um programa que, dado o consumo de em m3, calcula o valor da conta de
 água daquela residência.

**Entrada**
 A única linha da entrada contém um único inteiro N, indicando o consumo de água
 da residência, em m3 (0 <= N <= 1000).

**Saída**

 Seu programa deve imprimir uma única linha, contendo o valor da conta de água daquela residência

 ####  Questão 26: Verificação de Idade e Altura

Nos parques de diversão, alguns brinquedos têm idade e altura mínimas para poder
 andar neles. O parque possui 3 brinquedos que possuem essa limitação:

 ● Barca Viking: 1,5m de altura e 12 anos.
 ● Elevator of Death: 1,4m de altura e 14 anos.
 ● Final Killer: 1,7m de altura ou 16 anos.

 Dada a altura e a idade de uma pessoa, faça um programa que identifique quantos
 brinquedos ele pode andar.

 **Entrada**

 Dois valores um real (float) A e um inteiro (int) I, representando a altura (em m) e a
 idade, respectivamente.

 **Saída**

 Onúmero de brinquedos que ele pode andar no parque.

 #### Questão 31: Média de Notas Válidas

Faça um programa que leia as notas referentes às duas avaliações de um aluno.
Calcule e imprima a média semestral. Faça com que o programa só aceita notas
válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser
validada separadamente.

**Entrada**

A entrada contém vários valores reais, positivos ou negativos.

**Saída**

Se uma nota inválida for lida deve ser impressa a mensagem “NOTA INVÁLIDA”.
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "MÉDIA = "
seguido do valor do cálculo

####  Questão40:VerificaçãodePeso

Elabore um programa que permita receber o peso(float) e a altura(float) de uma
pessoa adulta. O programa deverá exibir uma das seguintes mensagens: “Parabéns
peso ideal”, “EngordeXXX Kg” ou “EmagreçaXXX Kg” de acordo com a tabela abaixo:

ALTURA PESOIDEAL
Até1.50 50kg
De1.51 até 1.90 70kg
Acimade 1.91 100kg

**Entrada**
Serão recebidos dois valores com dupla precisão (float) referente ao PESO e a
ALTURA.
**Saída**

Será informado uma das mensagens: “Parabéns, pesoideal!”, “EngordeXXX kg"ou
“EmagreçaXXX kg”.




  



