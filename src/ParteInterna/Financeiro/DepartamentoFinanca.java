package ParteInterna.Financeiro;

import ParteInterna.Funcionario;
import ParteInterna.IFuncionario;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoFinanca implements IFuncionario {
    protected List<Funcionario> funcionariosFinanca;

    public DepartamentoFinanca() {
        this.funcionariosFinanca = new ArrayList<>();
    }

    @Override
    public void adicionarFuncionario(String nome, String dataNascimento, long matricula, String cargo, double salario, boolean status) {

    }

    @Override
    public void removerFuncionario(long matricula, String nome) {

    }

    @Override
    public String listarTodosFuncionarios() {
        return null;
    }
}
