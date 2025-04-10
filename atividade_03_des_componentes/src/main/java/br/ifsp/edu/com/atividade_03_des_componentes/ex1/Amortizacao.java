package br.ifsp.edu.com.atividade_03_des_componentes.ex1;

import br.ifsp.edu.com.atividade_03_des_componentes.ex1.interfaces.*;

public class Amortizacao implements InterfaceAmortizacao {
    private InterfaceJuros juros;

    public Amortizacao(InterfaceJuros juros) {
        this.juros = juros;
    }

    @Override
    public void gerarPlano(double principal, double taxa, int periodo) {
        double montante = juros.calcularJurosCompostos(principal, taxa, periodo);
        double parcela = montante / periodo;

        System.out.println("Plano de Amortização:");
        for (int i = 1; i <= periodo; i++) {
            System.out.printf("Parcela %d: R$ %.2f%n", i, parcela);
        }
    }
}
