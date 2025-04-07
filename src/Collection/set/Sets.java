package Collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		/*
		É uma interface da Collection que representa um conjunto de elementos únicos, ou seja, não permite elementos duplicados.
		Não garante ordem específica dos elementos (a não ser que uma implementação o faça).
		Principais implementações:

		HashSet
		LinkedHashSet
		TreeSet

		 */


		Set<String> setStr = new HashSet<>();
		/*
		HashSet<E>
		Implementação mais comum de Set.
		Não garante ordem dos elementos.
		Muito rápido para operações de adição, remoção e busca.
		Baseado em tabela de dispersão (hash table).

		*/
		setStr.add("A");
		setStr.add("Ba");
		setStr.add("Ce");
		setStr.add("D");
		setStr.add("E");
		setStr.add("F");
		setStr.add("G");
		setStr.add("He");
		setStr.add("I");
		setStr.add("J");


		System.out.println(setStr);

		Set<Integer> setint = new LinkedHashSet<>();

		/*
		LinkedHashSet<E>
		Mantém a ordem de inserção dos elementos.
		Também não permite duplicatas.
		Usa uma combinação de hash table com lista duplamente ligada.
		*/

		setint.add(1);
		setint.add(2);
		setint.add(3);
		setint.add(4);
		setint.add(5);
		setint.add(6);
		setint.add(7);
		setint.add(8);
		setint.add(9);
		setint.add(10);


		System.out.println(setint);

		Set<Integer> setTree = new TreeSet<>();

		/*
		TreeSet<E>
		Garante que os elementos estejam sempre ordenados (ordem natural ou via Comparator).
		Baseado em uma árvore vermelha-preta (Red-Black Tree).
		Os elementos devem ser comparáveis (implementam Comparable) ou o TreeSet deve receber um Comparator.
		*/


		setTree.add(1000);
		setTree.add(21);
		setTree.add(334);
		setTree.add(432);
		setTree.add(54);
		setTree.add(61279);
		setTree.add(77);
		setTree.add(846);
		setTree.add(94);
		setTree.add(10);

		System.out.println(setTree);

	}
}