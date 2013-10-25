package okt02_priQueue_opg3;

import java.util.NoSuchElementException;

public class DoesNotCompile<T> implements PriQueueI<T> {

	private Item[] queue;
	private int numberOfElements;

	public DoesNotCompile() {
		@SuppressWarnings("unchecked")
		Item[] temp = (Item[]) new Object[10];
		queue = temp;

	}

	@Override
	public void insert(int priority, T data) {
		if (numberOfElements == queue.length) {
			@SuppressWarnings("unchecked")
			Item[] newArray = (Item[]) new Object[2 * numberOfElements];
			for (int i = 0; i < numberOfElements; i++) {
				newArray[i] = queue[i];
			}
			queue = newArray;
			System.out.println("Expanded array");
		}
		Item newItem = new Item();
		newItem.data = data;
		newItem.priority = priority;
		queue[numberOfElements] = newItem;
		numberOfElements++;

	}

	@Override
	public T removeMin() throws NoSuchElementException {
		Item highestPriotrity = null;
		if (numberOfElements > 0) {
			int indexOfHigh = 0;
			for (int i = 0; i < numberOfElements; i++) {
				if (queue[i].priority < queue[indexOfHigh].priority) {
					indexOfHigh = i;
				}
			}
			highestPriotrity = queue[indexOfHigh];
			// OBS SKAL MÅSKE VÆRE NOE -1!!
			for (int j = indexOfHigh; j < numberOfElements; j++) {
				queue[j] = queue[j + 1];
			}
			numberOfElements--;

		} else {
			throw new NoSuchElementException();
		}
		return highestPriotrity.data;
	}

	@Override
	public T min() throws NoSuchElementException {
		Item highestPriotrity = null;
		if (numberOfElements > 0) {
			int indexOfHigh = 0;
			for (int i = 0; i < numberOfElements; i++) {
				if (queue[i].priority < queue[indexOfHigh].priority) {
					indexOfHigh = i;
				}
			}
			highestPriotrity = queue[indexOfHigh];

		} else {
			throw new NoSuchElementException();
		}
		return highestPriotrity.data;
	}

	@Override
	public int size() {
		return numberOfElements;
	}

	@Override
	public boolean isEmpty() {
		return numberOfElements == 0;
	}

	public String toString() {
		String result = "[";
		for (int i = 0; i < numberOfElements; i++) {
			result += queue[i].data + ", ";
		}
		result = result.substring(0, result.length() - 2) + "]";
		return result;
	}

	private class Item {
		private int priority;
		private T data;
	}
}
