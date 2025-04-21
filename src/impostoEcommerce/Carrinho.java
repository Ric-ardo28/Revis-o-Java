package impostoEcommerce;

import java.util.List;

public class Carrinho {

	public static double calcularTotal(List<Produto> produtos) {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.calcularImposto();
		}
		return total;
	}
}
