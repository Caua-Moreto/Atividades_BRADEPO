package br.ifsp.edu.com.atividade_03_des_componentes.ex2;

import br.ifsp.edu.com.atividade_03_des_componentes.ex2.Interfaces.*;

public class ProcessarPedido implements InterfaceProcessarPedido {

    private InterfaceValidarEstoque validador;

    public ProcessarPedido(InterfaceValidarEstoque validador) {
        this.validador = validador;
    }

    @Override
    public void processar(String produto, int quantidade) {
        if (validador.validarEstoque(produto, quantidade)) {
            System.out.printf("Pedido de %d %s processado com sucesso.%n", quantidade, produto);
        } else {
            System.out.printf("Erro: Estoque insuficiente para %s.%n", produto);
        }
    }
}
