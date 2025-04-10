package br.ifsp.edu.com.atividade_03_des_componentes.ex3;

import br.ifsp.edu.com.atividade_03_des_componentes.ex3.interfaces.*;

public class FolhaPagamento implements InterfaceFolhaPagamento {

    private InterfaceCalcularHoras calculador;

    public FolhaPagamento(InterfaceCalcularHoras calculador) {
        this.calculador = calculador;
    }

    @Override
    public void calcularPagamento(String funcionario, double valorHora) {
        int horas = calculador.calcularHoras(funcionario);
        double salario = horas * valorHora;

        System.out.printf("Funcionário: %s%n", funcionario);
        System.out.printf("Horas trabalhadas: %d%n", horas);
        System.out.printf("Salário calculado: R$ %.2f%n", salario);
        System.out.println("----------------------------");
    }
}