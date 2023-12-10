package logic;

import java.util.Date;

/**
 * Classe que um Cliente
 */
public class Cliente implements ICliente {
    private final String nomeCompleto;
    private final String cpf;
    private final Date nascimento;
    private final String email;
    private final String celular;

    /**
     * @param nomeCompleto Nome completo do cliente
     * @param cpf CPF do cliente (contendo APENAS os dígitos)
     * @param nascimento Data de nascimento do cliente
     * @param email Email do cliente
     * @param celular Telefone celular do cliente
     */
    public Cliente(String nomeCompleto, String cpf, Date nascimento, String email, String celular){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.celular = celular;
    }

    /**
     * @return Nome completo do cliente
     */
    @Override
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @return CPF do cliente
     */
    @Override
    public String getCPF() {
        return cpf;
    }

    /**
     * @return Data de nascimento do cliente
     */
    @Override
    public Date getNascimento() {
        return nascimento;
    }

    /**
     * @return Email do cliente
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * @return Número de telefone do cliente
     */
    @Override
    public String getCelular() {
        return celular;
    }
}
