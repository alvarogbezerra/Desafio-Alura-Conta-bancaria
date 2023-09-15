package src.br.com.techfinance.clientes;

import java.time.LocalDate;

import src.br.com.techfinance.clientes.atributosdosclientes.Endereco;
import src.br.com.techfinance.contas.ContaCorrente;
import src.br.com.techfinance.contas.ContaInvestimento;

public class Cliente {
    private String email;
    private String senha;
    private Endereco endereco;
    private LocalDate dataDeAberturaDaConta;

    private ContaCorrente contaCorrente;
    private ContaInvestimento contaInvestimento;
}
