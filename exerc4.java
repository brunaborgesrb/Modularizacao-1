/*Programa para calcular o volume de sólidos geométricos. Os sólidos cujas áreas poderemos calcular serão:
cubo, esfera, cilindro e paralelepípedo. O programa deverá ter quatro funções: uma para o cálculo de cada tipo de volume.
(a) Função para calcular o volume de um cubo. Esta função deverá receber como parâmetro de entrada o valor do lado do cubo e
deverá retornar o volume calculado.
(b) Função para calcular o volume de um paralelepípedo. Esta função deverá receber como parâmetros de entrada os valores da
altura, largura e comprimento do paralelepípedo e deverá retornar o volume calculado.
(c) Função para calcular o volume de uma esfera. Esta função deverá receber como parâmetro de entrada o valor do raio da
esfera e deverá retornar o volume calculado.
(d) Função para calcular o volume de um cilindro. Esta função deverá receber como parâmetros de entrada os valores da altura e
raio da base do cilindro e deverá retornar o volume calculado.
.OBS1: Toda entrada e saída (exibição) de dados deve ser feita pelo programa principal (método main).
OBS2: O programa deverá ter um menu principal que permita ao usuário executar os sub-programas quantas vezes desejar e só
deverá terminar sua execução se o usuário solicitar. */

public static double volumeCubo (double lado) {
    double volume;
    volume = Math.pow(lado, 3);
    return volume;
}
public static double volumeParalelep (double altura, double largura, double comprim) {
    double volum;
    volum = altura * largura * comprim;
    return volum;
}
public static double volumeEsfera (double raio) {
    double volu;
    volu = 4.0 * Math.PI * Math.pow(raio, 3);
    return volu;
}
public static double volumeCilindro (double altura, double raio) {
    double vol;
    vol = Math.PI * Math.pow(raio, 2) * altura;
    return vol;
}

public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int opcao;
    double lado, result, altura, larg, compr, raio;
    System.out.println("CÁLCULO DE VOLUMES");
    do {
    System.out.println("1- cubo ");
    System.out.println("2- paralelepipedo ");
    System.out.println("3- esfera ");
    System.out.println("4- cilindro ");
    System.out.println("5- encerrar programa ");
    System.out.println("opção desejada: ");
    opcao = input.nextInt();
    switch (opcao) {
        case 1: System.out.print("informe o lado do cubo: ");
                lado = input.nextDouble();
                volumeCubo (lado);
                result = volumeCubo (lado);
                System.out.println("volume do cubo de lado " + lado + ": " + result);
                break;
        case 2: System.out.print("informe a altura do paralelepipedo: ");
                altura = input.nextDouble();
                System.out.print("informe a largura do paralelepipedo: ");
                larg = input.nextDouble();
                System.out.print("informe o comprimento do paralelepipedo: ");
                compr = input.nextDouble();
                result = volumeParalelep (altura, larg, compr);
                System.out.println("volume paralelepipedo: " + result);
                break;
        case 3: System.out.println("informe o raio da esfera: ");
                raio = input.nextDouble();
                result = volumeEsfera (raio);
                System.out.println("volume da esfera de raio: " +raio + ": " + result);
                break;
        case 4: System.out.println("informe a altura do cilindro: ");
                altura = input.nextDouble();
                System.out.println("informe o raio do cilindro: ");
                raio = input.nextDouble();
                result = volumeCilindro (raio, altura);
                System.out.println("volume cilindro: " + result);
                break;
        case 5: System.out.println("programa encerrado");
                break;
        default: System.out.println("opção inválida!!");
            }
    } 
    while (opcao != 5);
    

}

}

