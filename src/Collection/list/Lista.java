package Collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		/*
		Interface List<E>
		Representa uma coleção ordenada de elementos.
		Permite elementos duplicados.
		É possível acessar os elementos por índice (começando do 0).
		Permite inserir, remover e acessar elementos em posições específicas.
		 */
		List<String> listNome = new ArrayList<>();
		/*
		ArrayList<E>
        Baseado em array redimensionável.
        Acesso por índice é rápido, mas inserções/remoções no meio da lista são mais lentas.
        Muito usado quando o foco é leitura e acesso rápido aos elementos.
		 */

		listNome.add("Ricardo");
		listNome.add("Patricia");
		listNome.add("Heloisa");
		listNome.add("Bernardo");
		listNome.add("Theo");
		listNome.add("Antonio");

		System.out.println(listNome);
		System.out.println("Tamanho da lista: " + listNome.size());
		System.out.println(listNome.get(0));

		List<String> listNome2 = new LinkedList<>();

		/*
		LinkedList<E>
		Baseado em lista duplamente ligada.
		Inserções e remoções são mais rápidas do que no ArrayList, principalmente em posições intermediárias.
		Mais lento para acesso por índice (precisa percorrer a lista).
		 */

		listNome2.add("Ricardo");
		listNome2.add("Patricia");
		listNome2.add("Heloisa");
		listNome2.add("Bernardo");
		listNome2.add("Theo");
		listNome2.add("Antonio");

		System.out.println(listNome2);
		listNome2.add(0, "Cleonice");
		System.out.println(listNome2);
		System.out.println("Tamanho da lista: " + listNome2.size());

	}

}
