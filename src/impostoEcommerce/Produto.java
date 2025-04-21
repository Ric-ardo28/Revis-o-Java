package impostoEcommerce;

public abstract class Produto {
	private String nome;
	private double preco;
	private Pais paisVenda;

	public Produto(String nome, double preco, Pais paisVenda) {
		this.nome = nome;
		this.preco = preco;
		this.paisVenda = paisVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Pais getPaisVenda() {
		return paisVenda;
	}

	public void setPaisVenda(Pais paisVenda) {
		this.paisVenda = paisVenda;
	}

	public abstract double calcularImposto();
}
