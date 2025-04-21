package impostoEcommerce;

public class ProdutoFisico extends Produto {

	public ProdutoFisico(String nome, double preco, Pais paisVenda) {
		super(nome, preco, paisVenda);
	}

	@Override
	public double calcularImposto() {
		double imposto = getPreco() * 0.15 + 10.0;
		if(getPaisVenda() == Pais.BR){
			imposto += getPreco() * 0.05;
		}
		return imposto;
	}
}
