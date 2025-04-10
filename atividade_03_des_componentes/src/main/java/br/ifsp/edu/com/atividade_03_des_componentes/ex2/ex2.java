package br.ifsp.edu.com.atividade_03_des_componentes.ex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.ifsp.edu.com.atividade_03_des_componentes.ex2.Interfaces.*;

@SpringBootApplication
public class ex2 {

	public static void main(String[] args) {
		SpringApplication.run(ex2.class, args);
		InterfaceValidarEstoque validador = new ValidarEstoque();
		InterfaceProcessarPedido processador = new ProcessarPedido(validador);


		processador.processar("Notebook", 2);         
		processador.processar("Smartphone", 12);      
		processador.processar("Fone de Ouvido", 10);  
		processador.processar("Tablet", 1);    
	}

}
