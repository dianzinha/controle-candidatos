package com.br.controle_candidatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControleCandidatosApplication {
	public static void main(String[] args){

		System.out.println("Controle de Candidatos - DIO");
		analise(1900.00);
		analise(2200.00);
		analise(2000.00);
	}

	static void analise(double salarioPretendido) {
		double salarioBase = 2000.00;

		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if(salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA");
		else {
			System.out.println("AGUARDANDO OS DEMAIS CANDIDATOS");
		}
	}

}
