package ParteInterna;

public interface IFuncionario {
     void adicionarFuncionario(String nome, String dataNascimento, long matricula, String cargo, double salario, boolean status);
     void removerFuncionario(long matricula, String nome);
     String listarTodosFuncionarios();
}
