package logic;

import java.util.Date;

/**
 * Classe que um Cliente
 */
public class Cliente implements ICliente {
    private String nomeCompleto;
    private String cpf;
    private Date nascimento;
    private String email;
    private String celular;

    /**
     * @param nomeCompleto Nome completo do cliente
     * @param cpf CPF do cliente (contendo APENAS os dígitos)
     * @param nascimento Data de nascimento do cliente
     * @param email Email do cliente
     * @param celular Telefone celular do cliente
     */
    public Cliente(String nomeCompleto, String cpf, Date nascimento, String email, String celular, String contato){
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
        return null;
    }

    /**
     * @return CPF do cliente
     */
    @Override
    public String getCPF() {
        return null;
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
