package br.ifsp.edu.com.atividade_03_des_componentes.ex1;

import br.ifsp.edu.com.atividade_03_des_componentes.ex1.interfaces.*;

public class Juros implements InterfaceJuros {

    @Override
    public double calcularJurosCompostos(double principal, double taxa, int periodo) {

        return principal * Math.pow(1 + taxa, periodo);
    }
}
