import FrontCliente.Cliente;
import FrontCliente.Conta;
import FrontCliente.ContaCorrente;
import FrontCliente.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jonathan","10/08/2003","187.635.873.09",
                "Rua Oscarino Maciel, Sao Goncalo, Rio de Janeiro");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        cc.depositar(200);
        cc.sacar(50);
        cc.transferir(50,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        /*Gerente gerente1 = new Gerente("Matheus", "10-8-2003",20249893,
                "Gerente de TI", "TI",20000,true);
        System.out.println(gerente1);*/

    }
}