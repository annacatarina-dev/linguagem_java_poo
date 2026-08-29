package ConteudosTeoricos;

// --COMO COMENTAR NO JAVA--

// este é um comentário de uma linha!

/* este é um comentário de várias
 * linhas na linguagem java!
 */

// Abaixo é um comentário para DOCUMENTAÇÕES
/** Exemplo abaixo:
 * @author Ana Catarina
 * @version windows 11 pro
 * @since 25-02-26
 */
// =======================================================================================

// --CONCEITOS IMPORTANTES--

/* O que é um objeto? --> pode ser uma coisa material ou abstrata
 * percebida pelos sentidos e que possui características(atributos), comportamentos(métodos)
 * e o estado atual(são as características atuais do objeto)!,
 * a classe define o molde(caract, métodos e estado) que serão compartilhados p/ o objeto e
 * todo objeto vem de uma classe, ou seja, o molde usando para criar o objteto
 */

/* Javac --> compilador* java , JVM --> Máquina Virtual Java
*  JRE --> Ambiente de EXECUÇÃO java , JDK --> é um kit de DESENVOLVIMENTO java
* --> * o compilador transforma o código p/ a linguagem de máquina(binário)
 */

/* O java é fortemente tipado:
 * significa que o tipo da variável é
 * muito importante!!
 */

// =======================================================================================

// --DECLARANDO VARIÁVEIS--

// int idade = 3; | float salario = 1800.20f; | char letra = 'A'; | boolean casado = false;
// int idade = (int) 3; --> typecast
// float salario = (float) 1800.20; --> typecast
// char letra = (char) 'A'; --> typecast
// boolean casado = (boolean) false; --> typecast
// Integer idade = new Integer(3); --> Wrapper class
// Float salario = new Float(1800.20); --> Wrapper class
// Character letra = new Character('A'); --> Wrapper class
// Boolean casado = new Boolean(false); --> Wrapper class

/*
* Typecast: avaliação forçada de um valor ou variável p/ um tipo específico
* Wrapper class: declara um obj por meio da classe "Integer"
* O tipo char só armazena UM caractere ou um número inteiro com aspas simples!
* Não existe o tipo String, só existe a classe, String armazena 1 ou + caracteres
 */

/*int dado = 12;
*String nome = Integer.toString(dado); --> Como converter um tipo p/ outro tipo!
*Double dado2 = (double) dado; --> outra forma de converter é usando o typecast
 */

// =======================================================================================

// --SAÍDA DE DADOS--

/* Para printar sem quebra a linha! --> System.out.print("");
*  Para printar quebrando a linha! --> System.out.println("");
*  Para printar formatado --> System.out.printf("...  %.2f:" , valor);
* "sout" + TAB = System.out.println("");
* "souf" + TAB = System.out.printf("");
* "psvm" + TAB = public static void main(String[] args)
 */

/*
 * O "System.out.printf" ou "System.out.format" --> imprime uma variável formatada
 * "%.2f" é o número de casas decimais que vai ter!
 */

/* Como fortamatar as variáveis:
* "%s" --> é para variável tipo STRING
* "%d" --> é para variável do tipo INTEIRO
* %.1f --> é para variáveis FLOAT e DOUBLE
* Você coloca conforme a ordem das variáveis, exemplo:
*  "System.out.printf("O nome do : %s tem o número : %.2f  " , nome , valor);"
 */

// =======================================================================================

// --ENTRADA DE DADOS--

/* Importe --> "import java.util.Scanner;"
* depois --> Scanner input = new Scanner(System.in); como exemplo
* para permite que o usuário escreva e seja adionado ao objeto!
* em seguida: "int idade = input.nextInt();"
* "nome do Scanner".nextInt --> ler variável inteira
* "nome do Scanner".nextLine --> ler variável string
* "nome do Scanner".nextFloat --> ler variável float
 */

/* import java.util.Locale; --> é uma biblioteca
 * que possibilita responder os inputs
 * com ponto nas casas decimais, ex: 8.8
 */

// =======================================================================================

// --MODIFICADORES DE VISIBILIDADE--

/* Público:
* a classe atual e TODAS as outras
* têm acesso ao metodo/atributo criado!
*
* Privado:
* SÓ a classe atual tem acesso ao
* atributo/metodo
*
* Protegido:
* A classe atual e as suas
* sub-classe podem ter acesso! --> Herança
 */

// =======================================================================================

// --OPERADORES ARITMÉTICOS--

/* Adição --> 5 + 2 = 7 (o "+" pode ser usado p/ concatenar também!)
*  Subtração --> 5 - 2 = 3
*  Multiplicação --> 5 * 2 = 10
*  Divisão --> 5 / 2 = 2.5
*  Resto da divisão --> 5 % 2 = 1
 */
// --OPERADORES UNÁRIOS--

/* "++" --> Incremento (a = a + 1)
*  "--" --> Decremento (a = a - 1)
* o pré-incremento --> ++valor (é adicionado o incremento e dps soma com o "valor")
* o pós-incremento --> valor++ (é adicionado o "valor" e dps soma com o incremento)
* o pré-decremento --> --valor (é recebido o decremento e dps subtrai com o "valor")
* o pós-decremento --> valor-- (é recebido o "valor" e dps subtrai com o decremento )
* x += 2; --> (x = x + 2)
* x -= 3; --> (x = x - 3)
*/

// --CLASS MATH--

/* PI = constante π --> 3,1415 (Math.PI)...
*  pow = exponenciação --> Math.pow(5,2) = 25
*  sqtr = raiz quadrada --> Math.sqtr(36) = 6
*  cbrt = raiz cúbica --> Math.cbrt(27) = 3
 */

// --BIBLIOTECA RANDOM--

/*
* Serve p/ gerar números pseudoaleatórios no Java!
* ex:
* import java.util.Random; --.> importar biblioteca!
Random random = new Random(); --> instanciar objt random
*
--Número inteiro de 0 a 99
int numeroAte100 = random.nextInt(100);

--Dado de 6 lados (1 a 6)
--int numero = random.nextInt(max - min + 1) + min; -> p/ fazer um intervalo preciso
int dado = random.nextInt(6) + 1;

--Valor decimal entre 0.0 e 1.0
double percentual = random.nextDouble();

--Verdadeiro ou Falso
boolean moeda = random.nextBoolean();

        System.out.println("Aleatório (0-99): " + numeroAte100);
        System.out.println("Dado (1-6): " + dado);
        System.out.println("Percentual: " + percentual);
        System.out.println("Cara/Coroa (Boolean): " + moeda);
 */

// =======================================================================================

// --MÉTODOS, VETORES E MATRIZES--

/* os métodos servem p/ organizar e separa as funções do código
* public --> é a visibilidade da classe
* static --> indica que o metodo pertence à classe e não a um objeto dela
* void --> indica o retorno do metodo, que nesse caso é vazio, não retorna nada
* main --> é o nome do metodo
* (notas1, notas2) -> são os parâmetros que vão ser utilizados nas linhas de codigo
 */

/* Como fazer um vetor e uma matriz:
* double [][] matriz = new double[3][2];
* int[] vetor = {12,33,7...}; OU
* int[] vetor = new int[5];
*
* int[0] vetor = 6;
* int[1] vetor = 5;
* .....
* System.out.println(vetor.length):
 */
// "int[5]" -> reserva 5 posições do tipo inteiro
// "int[1] vetor = 2" -> acessa o índice 1 do vetor
// "vetor.length" -> conta o tamanho do vetor(pode utilizar no for tmb p/
// pecorrer as posições do vetor)
// exemplo:

/* o for tradicional:
*for (int i = 0; i < notas.length; i++) {
*   System.out.print("Digite a nota: ");
*   notas[i] = leitor.nextDouble();
* }
 */

/* o for "for-each":
* for (String nome : nomes) { -> "para cada String nome existente no vetor nomes"
*   System.out.println(nome);
* }
*
 */
// =======================================================================================

// --WHILE E FOR--

/* "for" : estrutura de repetição que tem a contagem de loops exatas, se for true roda!
*for (inicialização; condição; incremento/decremento) {
*     Código a ser executado
* }
*
* "for-each" : é um for mais reduzido, que não mostra o indice
*for (int i = 1; i <= 5; i++) {
*    System.out.println("Número: " + i);
*}
 */

/* "while" : estrutura de repetição que não tem contagem exata de loops, só roda se a condição for true!
* while (condição) {
*     Código a ser executado
*     LEMBRE-SE DO CONTADOR P/ NÃO DEIXAR O CÓDIGO INFINITO!
* }
*
* int contador = 1;
*
* while (contador <= 5) {
*    System.out.println("Contador: " + contador);
*    contador++; // Incremento manual
* }
 */