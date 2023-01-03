/*Implemente um programa para fazer conversão de dólar-real e real-dólar. O programa deverá ter os seguintes subprogramas:
(a) Função para converter real em dólar. Esta função receberá como parâmetro de entrada o valor em real a ser convertido e
deverá calcular e retornar para o programa o valor correspondente em dólar. O main se encarregará de exibir o resultado ao
usuário.
(b) Função para converter dólar em real. Esta função receberá como parâmetro de entrada o valor em dólar a ser convertido e
deverá calcular e retornar para o programa o valor correspondente em real. O main se encarregará de exibir o resultado ao
usuário.
OBS1: O programa deverá permitir que o usuário faça quantas conversões desejar e só deverá terminar sua execução se o usuário
solicitar.
OBS2: Toda entrada e saída de dados deve ser feita pelo programa principal (método main).
OBS3: Para simplificar, utilize o seguinte fator de conversão: 1 dólar = 4,82 reais */

public static double realEmDolar (double dolar) {
    double real;
    real = dolar/4.82;
    return real;
}
public static double dolarEmReal (double real) {
    double dolar;
    dolar = real*4.82;
    return dolar;
}
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
double real = 0, dolar = 0, valor = 0;
int opcao;
do {
    System.out.println("1- converter de dolar para real");
    System.out.println("2- converter de real para dolar");
    System.out.println("3- encerrar programa");
    System.out.println("opção desejada: ");
    opcao = input.nextInt();
switch (opcao) {
case 1: //converter de real para dolar
    System.out.println("informe o valor: ");
    valor = input.nextDouble();
    real = valor/4.82;
    System.out.println("valor convertido: " + real + "R$");
    break;
case 2: //converter de dolar para real
    System.out.println("informe o valor: ");
    valor = input.nextDouble();
    dolar = valor*4.82;
    System.out.println("valor convertido: " + dolar + "$");
    break;
case 3: System.out.println("programa encerrado!");
            break;
default:
    System.out.println("inválido!!");

}

}
while (opcao != 3);
}

}
