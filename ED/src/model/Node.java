package model;

public class Node<T> {
	
	T data;
	Node<T> next;
	
	public String toString() {
		return String.valueOf(data);
	}
	
}
