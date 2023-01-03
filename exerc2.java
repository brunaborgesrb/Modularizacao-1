/*Implemente um programa para fazer conversão de temperaturas em graus Fahrenheit para graus Celsius e vice-versa. O
programa deverá apresentar os seguintes subprogramas:
(a) Função para converter temperaturas em graus Fahrenheit para graus Celsius. Esta função receberá como parâmetro de
entrada o valor da temperatura em graus Fahrenheit a ser convertido e deverá calcular e retornar para o programa o valor
correspondente em graus Celsius. O main se encarregará de exibir o resultado ao usuário.
(b) Função para converter temperaturas em graus Celsius para graus Fahrenheit. Esta função receberá como parâmetro de
entrada o valor da temperatura em graus Celsius a ser convertido e deverá calcular e retornar para o programa o valor
correspondente em graus Fahrenheit. O main se encarregará de exibir o resultado ao usuário.
OBS1: O programa deverá permitir que o usuário faça quantas conversões desejar e só deverá terminar sua execução se o usuário
solicitar.
OBS2: Toda entrada e saída de dados deve ser feita pelo programa principal (método main).
OBS3: Para as conversões, utilize as fórmulas abaixo:

F = C * 1.8 + 32        C = (F-32)/1.8 */

public static double fahrenEmCelsius (double celsius) {
    double fahren;
    fahren = celsius * 1.8 + 32;
    return fahren;
    }
public static double celsiusEmFahren (double fahren) {
    double celsius;
    celsius = (fahren - 32)/1.8;
    return celsius;
}
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
double grau = 0, fahren, celsius;
int opcao;
do {
    System.out.println("1- converter de fahrenheit para celsius");
    System.out.println("2- converter de celsius para fahrenheit");
    System.out.println("3- encerrar programa");
    System.out.println("opção desejada: ");
    opcao = input.nextInt();
switch (opcao) {
case 1: //converter de fahrenheit para celsius
    System.out.println("informe quantos graus: ");
    grau = input.nextDouble();
    fahren = grau * 1.8 + 32;
    System.out.println("grau convertido: " + fahren + "F");
        break;
case 2: //converter de celsius para fahrenheit
    System.out.println("informe quantos graus: ");
    grau = input.nextDouble();
    celsius = (grau - 32)/1.8;
    System.out.println("grau convertido: " + celsius + "C");
       break;
case 3: System.out.println("programa encerrado!!");
       break;
default:
    System.out.println("inválido!!");
}
}
while (grau != 3);
}
}
