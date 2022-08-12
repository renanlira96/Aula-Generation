package com.generation.clientes;
/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Cliente {
	
		private int id;
		private String cpf;
		private String nome;
		private String endereco;
		private String email;
		private int telefone;
		
		public Cliente(int id, String cpf, String nome, String endereco, String email, int telefone) {
			this.id = id;
			this.cpf = cpf;
			this.nome = nome;
			this.endereco = endereco;
			this.email = email;
			this.telefone = telefone;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getTelefone() {
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		
		public void visualizar() {
			System.out.println("\nCódigo do cliente: " + id);
			System.out.println("\nCPF do cliente: " + cpf);
			System.out.println("\nNome do cliente: " + nome);
			System.out.println("\nEndereço do cliente: " + endereco);
			System.out.println("\nE-mail do cliente: " + email);
			System.out.println("\nTelefone do cliente: " + telefone);
		}
				
		
}
