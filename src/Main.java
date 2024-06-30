
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(200);
        cc.sacar(50);
        cc.transferir(50,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}