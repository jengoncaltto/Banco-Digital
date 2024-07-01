package FrontCliente;

import FrontCliente.Conta;

public interface iConta {
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contaDestino);
     void imprimirExtrato();
}
