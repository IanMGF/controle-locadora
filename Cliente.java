import java.util.Date;

public class Cliente implements ICliente {
    private String nomeCompleto;
    private String cpf;
    private Date nascimento;
    private String email;
    private String celular;
    private String contato;

    public Cliente(String nomeCompleto, String cpf, Date nascimento, String email, String celular, String contato){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.celular = celular;
        this.contato = contato;
    }

    @Override
    public String getNomeCompleto() {
        return null;
    }

    @Override
    public String getCPF() {
        return null;
    }

    @Override
    public Date getNascimento() {
        return nascimento;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public String getContato() {
        return contato;
    }
}
