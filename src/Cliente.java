package src;

//Acrescentei a pasta usuarios pois futuramente posso acrescentar tipos diferentes de clientes com base na renda deles.
//Falta acrescentar getters e setters dos outros dados para o cadastro

public class Cliente {
    private String idNome;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String endereco; //dá para detalhar melhor aqui
    private String numeroConta;
    private double saldo;

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
