package br.ifsp.edu.com.atividade_03_des_componentes.ex3;

import br.ifsp.edu.com.atividade_03_des_componentes.ex3.interfaces.*;

public class ex3 {
    public static void main(String[] args) {
        InterfaceCalcularHoras calculador = new CalcularHoras();
        InterfaceFolhaPagamento folha = new FolhaPagamento(calculador);

        folha.calcularPagamento("Alice", 25.0);
        folha.calcularPagamento("Bruno", 30.0);
        folha.calcularPagamento("Carla", 28.5);
        folha.calcularPagamento("Daniel", 22.0); 
    }
}