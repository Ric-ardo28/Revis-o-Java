package impostoEcommerce;

import java.util.List;
import java.util.ArrayList;

public class Main {
		public static void main(String[] args) {
			List<Produto> carrinho1 = new ArrayList<>();

			carrinho1.add(new ProdutoFisico("Notebook", 3000.0, Pais.BR));
			carrinho1.add(new ProdutoDigital("E-book", 100.0, Pais.US));
			carrinho1.add(new ProdutoDigital("Curso Online", 200.0, Pais.US));
			carrinho1.add(new ProdutoLimitado("Console Edição Limitada", 2500.0, Pais.BR));

			for (Produto produto : carrinho1) {
				System.out.printf("Produto: %s | Imposto: R$ %.2f%n", produto.getNome(), produto.calcularImposto());
			}

			double totalImpostos = Carrinho.calcularTotal(carrinho1);
			System.out.printf("\nTotal de impostos no carrinho: R$ %.2f%n", totalImpostos);
		}
	}


