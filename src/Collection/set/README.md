## 📌 Interface `Set<E>`

- Representa um **conjunto de elementos únicos** (não permite duplicatas).
- É parte da Collection Framework.
- Não garante ordem específica (depende da implementação).
- Implementações principais:
    - `HashSet`
    - `LinkedHashSet`
    - `TreeSet`
Implementação	 Permite Duplicados?	Ordenação	                 Performance
HashSet	            ❌ Não              ❌ Não mantém ordem	      🔥 Mais rápido
LinkedHashSet	    ❌ Não	            ✅ Ordem de inserção	      🟢 Um pouco mais lento
TreeSet	            ❌ Não	            ✅ Ordem natural/customizada  🟡 Mais lento (ordenado)