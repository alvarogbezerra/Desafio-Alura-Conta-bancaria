package src.br.com.techfinance.contas;

public class Conta {
    private double saldo;
    private String numero;
    private double agencia;
    private String extrato;

    public void depositar(Double valor) {
        this.saldo += valor;
        System.out.println("\n Depósito de " + valor + " realizado.");
    }

    public void sacar(Double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("\n Valor superior ao disponível na conta. \nPor favor insira um valor válido.");
        }
    }

    public void transferir(Double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("\n Valor superior ao disponível na conta. \nPor favor insira um valor válido.");
        }
    }

    public void verSaldo(){
        System.out.println("\n Seu saldo é de R$ " + this.saldo + " .");
    }
    
    //public void verExtrato(): List<Transacao> //desenvolver isso posteriormente;
    //lembrar de alterar na função extrato quando realizamos alguma ação;

}
