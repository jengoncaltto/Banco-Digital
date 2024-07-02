package ParteInterna.Administracao;

import ParteInterna.Funcionario;
import ParteInterna.IFuncionario;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoAdm implements IFuncionario {
    protected List<Funcionario> funcionariosAdm;

    public DepartamentoAdm() {
        this.funcionariosAdm = new ArrayList<>();
    }

    @Override
    public void adicionarFuncionario(String nome, String dataNascimento, long matricula, String cargo, double salario, boolean status) {
        funcionariosAdm.add(new Funcionario(nome, dataNascimento, matricula, cargo, salario, status));
    }

    @Override
    public void removerFuncionario(long matricula) {
        if(!funcionariosAdm.isEmpty()){
            for (Funcionario f: funcionariosAdm) {
                if(f.getMatricula() == matricula){
                    funcionariosAdm.remove(f);
                }
            }
        }
    }

    @Override
    public Funcionario pesquisaFuncionarioMatricula(long matricula) {
        Funcionario func = null;
        if(!funcionariosAdm.isEmpty()){
            for (Funcionario f: funcionariosAdm) {
                if(f.getMatricula() == matricula){

                    func = f;
                }
            }
        }
        return func;
    }

    @Override
    public String toString() {
        return "DepartamentoAdm" +funcionariosAdm;
    }

    @Override
    public String listarTodosFuncionarios() {
        return toString();
    }
}
