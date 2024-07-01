import FrontCliente.Cliente;
import FrontCliente.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    protected List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
}
