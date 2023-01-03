/* Um banco concederá um crédito pessoal aos seus clientes de acordo com seu saldo médio no último ano. Implemente uma
função que receba como parâmetro o valor do saldo médio do cliente no último ano, calcule e retorne o valor do crédito que será
concedido a ele. O cálculo deve ser feito de acordo com a tabela abaixo. Para cada cliente, o programa principal (método main)
deverá exibir a seguinte frase: “Para um saldo médio igual a R$___, será dado um crédito de R$___.”
Valor do Saldo Médio                  Valor do Crédito
Até R$ 200,00                         10% do saldo médio
Acima de R$ 200,00 até R$ 300,00      20% do saldo médio
Acima de R$ 300,00 até R$ 400,00      25% do saldo médio
Acima de R$ 400,00                    30% do saldo médio
OBS1: Para o fornecimento do crédito, o saldo médio do cliente não pode ser negativo ou nulo. Caso seja, deve ser informado ao
cliente que ele não terá direito ao benefício;
OBS2: A quantidade de clientes que utilizarão o programa para fazer o cálculo de seu crédito pessoal não é previamente
conhecida. Desta forma, a cada cálculo realizado, deve-se perguntar ao usuário se ele deseja efetuar um novo cálculo. A esta
pergunta o usuário deverá responder, obrigatoriamente, ‘S’ ou ‘N’. O programa não deve aceitar nenhum outro valor de resposta. */

public static double valSaldoMedio (double valCredito, double valSaldoMedio) {
    double valCredito1;
    double credito = 0;
    valCredito1 = valSaldoMedio * credito;
    return valCredito1;
}
            

public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double valSaldoMedio, valCredito;
    System.out.println("informe o valor do saldo médio: ");
    valSaldoMedio = input.nextDouble();
    while (valSaldoMedio != 0) {
    if (valSaldoMedio < 200) {
        valSaldoMedio = input.nextDouble();
        valCredito = valSaldoMedio * (0.10 + valSaldoMedio);
        System.out.println("Para um saldo médio igual a R$" + valSaldoMedio + "será dado um crédito de R$" + valCredito);
    }
    if (valSaldoMedio >= 200 && valSaldoMedio <= 300) {
        valSaldoMedio = input.nextDouble();
        valCredito = valSaldoMedio * (0.20 + valSaldoMedio);
        System.out.println("Para um saldo médio igual a R$" + valSaldoMedio + "será dado um crédito de R$" + valCredito);
        }
    if (valSaldoMedio > 300 && valSaldoMedio <= 400) {
        valSaldoMedio = input.nextDouble();
        valCredito = valSaldoMedio * (0.25 + valSaldoMedio);
        System.out.println("Para um saldo médio igual a R$" + valSaldoMedio + "será dado um crédito de R$" + valCredito);
    }
    if (valSaldoMedio < 400) {
        valSaldoMedio = input.nextDouble();
        valCredito = valSaldoMedio * (0.30 + valSaldoMedio);
        System.out.println("Para um saldo médio igual a R$" + valSaldoMedio + "será dado um crédito de R$" + valCredito);
    }
    else {
        System.out.println("inválido!");
    }
    }
}

}
