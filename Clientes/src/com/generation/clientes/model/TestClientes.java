package com.generation.clientes.model;

import com.generation.clientes.Cliente;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class TestClientes {

	public static void main(String[] args) {
		//public Cliente(int id, String cpf, String nome, String endereco, String email, int telefone) {

		
		Cliente cliente = new Cliente(225,"46853971200","Roberto da Silva","Rua Padre Rodrigues Fernandes","Roberto@gmail.com",55628774);
		cliente.visualizar();
		Cliente cliente2 = new Cliente(502,"3589781500","Daniel","Praia paulistinha","Daniel@gmail.com",45820136);
		cliente2.visualizar();

	}

}
