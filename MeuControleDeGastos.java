import java.util.Scanner;

public class MeuControleDeGastos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Pergunta nome
        System.out.println("""
        Olá, seja bem vindo!
        Digite o seu nome para inicializarmos um cadastro.
        """);
        String nome = leitura.nextLine();

        //Definição se é conta corrente ou não adiciono nada
        String tipoDeConta = "0";
        System.out.println("""
        Deseja adicionar o tipo de conta?
        Se sim, digite 1, se não, digite 2.
        """);
        String adicionarContaOuNao = leitura.nextLine();


        if (adicionarContaOuNao.equals("1")) {
            System.out.println("Digite 1 para 'Conta Corrente' ou 2 para 'Conta Investimento'.");
            String correnteOuInvestimento = leitura.nextLine();
            if (correnteOuInvestimento.equals("1")) {
                tipoDeConta = "Conta Corrente";
            }
            if (correnteOuInvestimento.equals("2")) {
                tipoDeConta = "Conta Investimento";
            }
        }

        System.out.println("Nome: " + nome + "\nTipo de conta: " + tipoDeConta);


    }
}

/*
* ***********************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
* */