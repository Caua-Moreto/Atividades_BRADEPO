package br.ifsp.edu.com.atividade_03_des_componentes.ex2;

import java.util.HashMap;
import java.util.Map;

import br.ifsp.edu.com.atividade_03_des_componentes.ex2.Interfaces.*;

public class ValidarEstoque implements InterfaceValidarEstoque {

    private Map<String, Integer> estoque;

    public ValidarEstoque() {
        estoque = new HashMap<>();
        estoque.put("Notebook", 5);
        estoque.put("Smartphone", 10);
        estoque.put("Fone de Ouvido", 15);
    }

    @Override
    public boolean validarEstoque(String produto, int quantidade) {
        if (estoque.containsKey(produto)) {
            int disponivel = estoque.get(produto);
            return disponivel >= quantidade;
        }
        return false;
    }
}

