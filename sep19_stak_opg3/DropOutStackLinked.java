package sep19_stak_opg3;

public class DropOutStackLinked<T> implements StackI<T> {

	private int maxElements;
	private int numberOfElements;
	private Node firstNode;

	public DropOutStackLinked(int maxElements) {
		this.maxElements = maxElements;
		numberOfElements = 0;
		firstNode = null;
	}

	@Override
	public void push(T newEntry) {
		Node newNode = new Node();
		newNode.data = newEntry;
		newNode.next = firstNode;
		firstNode = newNode;
		numberOfElements++;
		if (numberOfElements > maxElements) {
			Node currentNode = firstNode;
			if (maxElements == 1) {
				firstNode.next = null;
			}
			if (maxElements > 1) {
				while (currentNode.next.next != null) {
					currentNode = currentNode.next;
				}
				// System.out.println(currentNode.next.data);
				currentNode.next = null;

				numberOfElements--;
			}
		}

	}

	@Override
	public T pop() {
		T result = null;
		if (firstNode != null) {
			result = firstNode.data;
			firstNode = firstNode.next;

			numberOfElements--;
		}
		return result;
	}

	@Override
	public T peek() {
		T result = null;
		if (firstNode != null) {
			result = firstNode.data;
		}
		return result;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return maxElements == numberOfElements;
	}

	@Override
	public void clear() {
//		numberOfElements = 0;
//		firstNode = null;
		while(numberOfElements>0){
			pop();
		}
		
	}

	private class Node {
		private T data;
		private Node next;

	}

}
