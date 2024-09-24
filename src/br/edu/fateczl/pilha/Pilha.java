package br.edu.fateczl.pilha;

public class Pilha<T> {
	
	Node<T> topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(T valor) {
		Node<T> node = new Node<>();
		node.dado = valor;
		node.proximo = topo;
		topo = node;
	}
	
	public T pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		T valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public T top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		return topo.dado;
	}
	
	public int size() {
		int tamanho = 0;
		Node<T> aux = topo;
		while (aux != null) {
			tamanho++;
			aux = aux.proximo;
		}
		return tamanho;
	}
}
