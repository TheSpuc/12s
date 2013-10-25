package sep19_stak_opg1;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListStack<T> implements StackI<T> {

	private List<T> stack;
	private int top;

	public ListStack() {

		stack = new ArrayList<T>();
	}

	public ListStack(int size) {
		stack = new ArrayList<T>();
		top = 0;
	}

	@Override
	public void push(T newEntry) {
		stack.add(newEntry);
		top++;

	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		T result = null;
		if (stack.isEmpty()) {
			throw new NoSuchElementException();
		} else {
			if (top > 0) {
				result = stack.get(top - 1);
				stack.remove(result);
				top--;
			}
		}
		return result;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		T result = null;
		if (stack.isEmpty()) {
			throw new NoSuchElementException();
		} else {
			if (top > 0) {
				result = stack.get(top - 1);
			}
		}
		return result;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		for (T t : stack) {
			stack.remove(t);
		}
		top = 0;

	}

}
