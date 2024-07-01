import java.time.LocalDate;
import java.util.Date;

public abstract class Funcionario {
    private String nome;
    private String dataNascimento;
    private long matricula;
    private String email;
    private String cargo;
    private String departamento;
    private String telefone;
    private double Salario;
    private boolean Status;

    public Funcionario(String nome, String dataNascimento, long matricula, String cargo, String departamento, double salario, boolean status) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.cargo = cargo;
        this.departamento = departamento;
        Salario = salario;
        Status = status;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", matricula=" + matricula +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                ", departamento='" + departamento + '\'' +
                ", telefone='" + telefone + '\'' +
                ", Salario=" + Salario +
                ", Status=" + Status +
                '}';
    }
}
