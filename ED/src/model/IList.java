package model;

public interface IList<T> {
	
	public void addFirst(T t);
	public void addLast(T t) throws Exception;
	public void add(T t, int pos) throws Exception;
	public void add(T t) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast()  throws Exception;
	public void remove(int pos) throws Exception;
	public boolean isEmpty();
	public T get(int pos) throws Exception;
	public int size();

}
