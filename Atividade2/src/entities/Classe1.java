package entities;

public class Classe1 {

	private String nome;
	private String sobrenome;
	private int numero;
	private boolean ativo;
	
	public Classe1(String nome, String sobrenome, int numero, boolean ativo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numero = numero;
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
