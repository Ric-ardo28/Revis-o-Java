package Collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
	/*
	Interface Map<K, V>
	Representa uma estrutura de chave-valor.
	Cada chave é única.
	Os valores podem ser duplicados.
	Não faz parte da interface Collection, mas também está na Collection Framework.

	Métodos principais:
	put(K key, V value)
	get(K key)
	remove(K key)
	containsKey(K key)
	containsValue(V value)
	keySet(), values(), entrySet()
	 */

		Map<Integer, String> map = new TreeMap<>();
		map.put(8, "Ricardo");
		map.put(4, "Patricia");
		map.put(5, "Heloisa");
		map.put(3, "Bernardo");
		map.put(2, "Theo");
		map.put(10, "Ricardo RS");
		map.put(7, "Oliveira");
		map.put(1, "Eva");
		map.put(9, "Pat");
		map.put(6, "Ric");

		for (Integer key : map.keySet()) {
			System.out.println("Chave: " + key + " Valor: " + map.get(key));
		}

		System.out.println(map);

		System.out.println("_------------------------------------------_");


	Map<String, Integer> mapp = new HashMap<>();

	mapp.put("Ricardo", 38);
	mapp.put("Patricia", 31);
	mapp.put("Heloisa", 10);
	mapp.put("Bernardo", 8);
	mapp.put("Theo", 6);

	Integer soma = 0;
	for (Integer valor : mapp.values()) {
		soma += valor;


	}
		System.out.println(mapp);
	System.out.println(soma);
}
}
