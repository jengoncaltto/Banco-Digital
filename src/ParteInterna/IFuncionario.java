package ParteInterna;

public interface IFuncionario {
     void adicionarFuncionario(String nome, String dataNascimento, long matricula, String cargo, double salario, boolean status);
     void removerFuncionario(long matricula);
     public Funcionario pesquisaFuncionarioMatricula(long matricula);
     String listarTodosFuncionarios();
}
