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
        funcionariosFinanca.add(new Funcionario(nome, dataNascimento, matricula, cargo, salario, status));

    }

    @Override
    public void removerFuncionario(long matricula) {
        if(!funcionariosFinanca.isEmpty()){
            for (Funcionario f: funcionariosFinanca) {
                if(f.getMatricula() == matricula){
                    funcionariosFinanca.remove(f);
                }
            }
        }
    }

    @Override
    public Funcionario pesquisaFuncionarioMatricula(long matricula) {
        Funcionario func = null;
        if(!funcionariosFinanca.isEmpty()){
            for (Funcionario f: funcionariosFinanca) {
                if(f.getMatricula() == matricula){
                    func = f;
                }
            }
        }
        return func;
    }

    @Override
    public String toString() {
        return "DepartamentoFinanca" +  funcionariosFinanca;
    }

    @Override
    public String listarTodosFuncionarios() {
        return toString();
    }
}
