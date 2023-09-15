package src.br.com.techfinance.contas;

public class Conta {
    private double saldo;
    private String numero;
    private double agencia;
    private String historico;

    public void depositar (Double valor) {
        this.saldo += valor; 
        System.out.println("\n Depósito de \" + valor + \" realizado.");
    }

    public void sacar (Double valor) {
        if 
    }
    /*
    sacar(valor: double): boolean
    verificarSaldo(): double
    verificarExtrato(): List<Transacao> 
    */
}
