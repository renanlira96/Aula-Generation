package com.generation.conta;

import com.generation.conta.model.Conta;

public class Menu {
	
	public static void main(String[] args) {
		
		
		Conta c1 = new Conta(123456, "123", "CC", "João da Silva", 2000.50f);
		Conta c2 = new Conta(123457, "123", "CC", "Amanda", 200000.0f);
		
		System.out.println("Saldo da Conta c1: "+c1.getSaldo());
		System.out.println("Saldo da Conta c2: "+c2.getSaldo());
		
		c1.setSaldo(3000.50f);
		System.out.println("Saldo Atualizado da Conta c1: "+c1.getSaldo());
		
		c2.setTitular("Amanda Giacometti");
		System.out.println("Titular Atualizado da Conta c1: "+c2.getTitular());
		
		System.out.println(c1.toString());
		
		Conta c3 = new Conta();
		System.out.println(c3.toString());
		
		if(c2.sacar(1000.0f)==true){
			System.out.println(c2.toString());
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
	}
}
