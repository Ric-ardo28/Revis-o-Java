package impostoEcommerce;

public class ProdutoLimitado extends ProdutoFisico{
	public ProdutoLimitado(String nome, double preco, Pais paisVenda) {
		super(nome, preco, paisVenda);
	}

	@Override
	public double calcularImposto() {
			return 50.0 + super.calcularImposto();
	}
}
