package ParteInterna.TI;

import ParteInterna.Funcionario;
import ParteInterna.IFuncionario;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoTI implements IFuncionario {
    protected List<Funcionario> funcionariosTI;

    public DepartamentoTI() {
        this.funcionariosTI = new ArrayList<>();
    }
    @Override
    public void adicionarFuncionario(String nome, String dataNascimento, long matricula, String cargo, double salario, boolean status) {
        funcionariosTI.add(new Funcionario(nome, dataNascimento, matricula, cargo, salario, status));
    }

    @Override
    public void removerFuncionario(long matricula) {
        if(!funcionariosTI.isEmpty()){
            for (Funcionario f: funcionariosTI) {
                if(f.getMatricula() == matricula){
                    funcionariosTI.remove(f);
                }
            }
        }
    }

    public Funcionario pesquisaFuncionarioMatricula(long matricula){
        Funcionario func = null;
        if(!funcionariosTI.isEmpty()){
            for (Funcionario f: funcionariosTI){
                if(f.getMatricula() == matricula){
                    func = f;
                }
            }
        }
        return func;
    }

    @Override
    public String listarTodosFuncionarios(){
        return toString();
    }

    @Override
    public String toString() {
        return "DepartamentoTI " + funcionariosTI;
    }

    public static void main(String[] args) {
        DepartamentoTI ti = new DepartamentoTI();

        ti.adicionarFuncionario("Matheus", "10-8-2003",20249893,
                "Estagiario",20000,true);
        ti.adicionarFuncionario("Isabelle", "23-01-2003", 202448753,"Estagiaria", 1300, true);

        System.out.println(ti.listarTodosFuncionarios());
        ti.removerFuncionario(20249893);
        System.out.println(ti.listarTodosFuncionarios());
    }
}

