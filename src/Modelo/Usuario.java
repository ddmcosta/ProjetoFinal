package Modelo;

public class Usuario {
	
	private int id;
	private String nome;
	private Long cpf;
	private String endereço;
	private Long telefone;
	private String email;
	private int senha;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(long l) {
		this.cpf = (long) l;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(long l) {
		this.telefone = (long) l;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}