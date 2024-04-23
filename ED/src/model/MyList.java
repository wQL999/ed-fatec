package model;

public class MyList<T> implements IList<T> {

	private Node<T> first;

	public MyList() {
		first = null;
	}

	@Override
	public void addFirst(T t) {
		Node<T> element = new Node<>();

		element.data = t;
		element.next = first;
		first = element;

	}

	@Override
	public void addLast(T t) throws Exception {
		if (isEmpty())
			addFirst(t);

		Node<T> element = new Node<>();
		element.data = t;
		element.next = null;
		Node<T> last = getNode(size() - 1);
		last.next = element;

	}

	@Override
	public void add(T t, int pos) throws Exception {
		if (pos < 0 || pos > size())
			throw new Exception("Invalid position.");

		if (pos == 0)
			addFirst(t);
		else if (pos == size())
			addLast(t);
		else {
			Node<T> aux = getNode(pos - 1);
			Node<T> element = new Node<>();
			element.data = t;
			element.next = aux;
			aux.next = element;
		}

	}
	
	@Override
	public void add(T t) throws Exception {
		addFirst(t);
	}

	@Override
	public void removeFirst() throws Exception {
		if (isEmpty())
			throw new Exception("Null list.");

		first = first.next;

	}

	@Override
	public void removeLast() throws Exception {
		if (isEmpty())
			throw new Exception("Null list");
		
		int len = size();
		if (len == 1)
			removeFirst();
		else {
			Node<T> aux = getNode(len - 2);
			aux.next = null;
		}
	}

	@Override
	public void remove(int pos) throws Exception {
		if(isEmpty())
			throw new Exception("Null lsit");
		
		int len = size();
		
		if(pos < 0 || pos > len-1)
			throw new Exception("Invalid position");
		
		if(pos == 0)
			removeFirst();
		else if(pos == len-1)
			removeLast();
		else {
			Node<T> ant = getNode(pos-1);
			Node<T> curr = getNode(pos);
			
			ant.next = curr.next;
			
		}

	}

	@Override
	public boolean isEmpty() {
		return first == null ? true : false;
	}

	@Override
	public T get(int pos) throws Exception {
		Node<T> aux = getNode(pos);
		return aux.data;
	}

	@Override
	public int size() {
		int i = 0;

		if (!isEmpty()) {
			Node<T> aux = first;
			while (aux != null) {
				i++;
				aux = aux.next;
			}
		}
		return i;
	}

	private Node<T> getNode(int pos) throws Exception {
		if (isEmpty())
			throw new Exception("Null List");

		int len = size();
		if (pos < 0 || pos > len - 1)
			throw new Exception("Invalid Position");

		Node<T> aux = first;
		int i = 0;
		while (i < pos) {
			i++;
			aux = aux.next;
		}

		return aux;
	}

}
