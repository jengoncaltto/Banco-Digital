package ParteInterna;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Funcionario {
    private String nome;
    private String dataNascimento;
    private long matricula;
    private String cargo;
    private double Salario;
    private boolean Status;

    public Funcionario(String nome, String dataNascimento, long matricula, String cargo, double salario, boolean status) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.cargo = cargo;
        Salario = salario;
        Status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return Salario;
    }

    public boolean isStatus() {
        return Status;
    }

    @Override
    public String toString() {
        return '\n'+ "Funcionario"+
                "{nome = '" + nome + '\'' +
                ", dataNascimento = '" + dataNascimento + '\'' +
                ", matricula = " + matricula +
                ", cargo = '" + cargo + '\'' +
                ", Salario = " + Salario +
                ", Status = " + Status +
                '}';
    }

}
