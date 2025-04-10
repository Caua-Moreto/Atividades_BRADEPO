package br.ifsp.edu.com.atividade_03_des_componentes.ex3;

import java.util.HashMap;
import java.util.Map;
import br.ifsp.edu.com.atividade_03_des_componentes.ex3.interfaces.*;

public class CalcularHoras implements InterfaceCalcularHoras {

    private Map<String, Integer> bancoDeHoras;

    public CalcularHoras() {
        bancoDeHoras = new HashMap<>();
        bancoDeHoras.put("Alice", 160); 
        bancoDeHoras.put("Bruno", 120);
        bancoDeHoras.put("Carla", 180);
    }

    @Override
    public int calcularHoras(String funcionario) {
        return bancoDeHoras.getOrDefault(funcionario, 0);
    }
}