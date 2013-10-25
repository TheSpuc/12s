package sep19_stak_opg3;

public class Test {

	public static void main(String[] args) {
		DropOutStackLinked<Integer> stack = new DropOutStackLinked<>(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek() + "\n");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.clear();
		System.out.println("\n" + stack.pop());
		System.out.println(stack.peek());

	}

}
