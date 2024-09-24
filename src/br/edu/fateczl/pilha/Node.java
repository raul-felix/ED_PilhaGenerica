package br.edu.fateczl.pilha;

public class Node<T> {
	
	T dado;
	Node<T> proximo;
	
	@Override
	public String toString() {
		return "Node [" + dado + "]";
	}

}
