package src;
import java.util.Scanner;

public class UsuarioCadastrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente novoCliente = new Cliente();
        
        //O cpf e a senha no momento são só para enfeite. Procurar futuramente o método equals.
        System.out.println("Olá, seja bem vindo ao banco digital TechFinance!\nDigite os seus dados para fazermos o cadastro.\n");
        
        //Definindo nome
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        novoCliente.setNome(nome);

        //Definindo cpf
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        novoCliente.setcpf(cpf);

        //Falta acrescentar getters e setters dos outros dados para o cadastro
        
        //O saldo inicial começará com 0 pois o cliente estaria abrindo a conta dele 
        
        double saldo = 0; 
        novoCliente.setSaldo(saldo);
        
        String menu = """
            ****************************************
            Seja bem vindo Sr. %s
            Tipo conta:    Corrente
            Saldo:         R$ %.2f
            ****************************************
            """.formatted(novoCliente.getNome(), novoCliente.getSaldo());

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
                novoCliente.getSaldoMensagem();
            }else if (numeroDaOpcao == 2) {
                System.out.println("Informe o valor a receber: ");
                int saldoAserSomado = scanner.nextInt();
                saldo += saldoAserSomado;
                novoCliente.getSaldoMensagem();
            }else if (numeroDaOpcao == 3) {
                System.out.println("Informe o valor a ser transferido: ");
                int saldoAserAbatido = scanner.nextInt();
                if (saldoAserAbatido > saldo) {
                    System.out.println("Seu saldo é insuficiente, por favor, insira um valor compatível com o seu salto atual que é de: R$ " + saldo);
                } if (saldoAserAbatido <= saldo) {
                    saldo -= saldoAserAbatido;
                    novoCliente.getSaldoMensagem();}
            }else if (numeroDaOpcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida. Por favor, digite uma das opções abaixo.");
            }

            System.out.println(opcoes);
        }
    }
}
