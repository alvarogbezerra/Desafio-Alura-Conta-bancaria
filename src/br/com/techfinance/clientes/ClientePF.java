package src.br.com.techfinance.clientes;

import java.time.LocalDate;

import src.br.com.techfinance.contas.ContaCorrente;
import src.br.com.techfinance.contas.ContaInvestimento;

//Acrescentei a pasta usuarios pois futuramente posso acrescentar tipos diferentes de clientes com base na renda deles.
//Falta acrescentar getters e setters dos outros dados para o cadastro

public class ClientePF extends Cliente {
    private String titular;//a regra de negócios é que seja o nome maúsculo
    private String cpf;
    private LocalDate dataNascimento;


    //revisar construtor
    public ClientePF(String nome, String cpf, LocalDate dataNascimento, ContaCorrente conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.conta = conta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public String getSaldoMensagem() {
        return "Seu saldo atual é de: R$ " + this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
