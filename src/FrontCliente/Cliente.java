public class Cliente {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String dataNascimento, String cpf, String endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }
}
