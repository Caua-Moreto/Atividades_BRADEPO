package br.ifsp.edu.com.atividade_03_des_componentes.ex1;

import br.ifsp.edu.com.atividade_03_des_componentes.ex1.interfaces.*;

public class ex1 {
    public static void main(String[] args) {

        InterfaceJuros juros = new Juros();

        InterfaceAmortizacao amortizacao = new Amortizacao(juros);

        double principal = 10000.0;
        double taxa = 0.02; 
        int periodo = 12; 

        amortizacao.gerarPlano(principal, taxa, periodo);
    }
}