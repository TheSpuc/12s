package sep19_stak_opg3;

public class DropOutStackArray<T> implements StackI<T> {

	private T stack[];
	private int maxCapacity;
	private int numberOfElement;
	private Node firstNode;

	public DropOutStackArray(int maxCapacity) {

	}

	@Override
	public void push(T newEntry) {
		// TODO Auto-generated method stub

	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	private class Node {
		private T data;
		private Node next;
	}

}
