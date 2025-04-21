package impostoEcommerce;

public class ProdutoDigital extends Produto {

	public ProdutoDigital(String nome, double preco, Pais paisVenda) {
		super(nome, preco, paisVenda);
	}
	public double calcularImposto() {
		if(getPaisVenda() == Pais.US){
			return 0.0;
		}
		return getPreco() * 0.20;
	}
}
