import java.util.Scanner;

public class MeuControleDeGastos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo!\nDigite o seu nome para inicializarmos um cadastro.\n");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu saldo. ");
        int saldo = scanner.nextInt();

        String menu;
        menu = """
                ****************************************
                Dados iniciais do cliente:
                Nome:          %s
                Tipo conta:    Corrente
                Saldo inicial: R$ %d
                ****************************************
                """.formatted(nome, saldo);

        String opcoes = """
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:""";
        System.out.println(menu+opcoes);
        int interruptor = 1;
        int numeroDaOpcao = 0;

        while (interruptor == 1 || numeroDaOpcao != 4) {
            numeroDaOpcao = scanner.nextInt();

            if (numeroDaOpcao == 1) {
                System.out.println("Seu saldo atual é: R$ " + saldo);
            }else if (numeroDaOpcao == 2) {
                System.out.println("Informe o valor a receber: ");
                int saldoAserSomado = scanner.nextInt();
                saldo += saldoAserSomado;
                System.out.println("Saldo atualizado: " + saldo);
            }else if (numeroDaOpcao == 3) {
                System.out.println("Informe o valor a ser transferido: ");
                int saldoAserAbatido = scanner.nextInt();
                if (saldoAserAbatido > saldo) {
                    System.out.println("Seu saldo é insuficiente, por favor, insira um valor compatível com o seu salto atual que é de: R$ " + saldo);
                } if (saldoAserAbatido <= saldo) {
                    saldo -= saldoAserAbatido;
                    System.out.println("Saldo atualizado: " + saldo);}
            }else if (numeroDaOpcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida. Por favor, digite uma das opções abaixo.");
            }

            System.out.println(opcoes);
        }
    }
}
