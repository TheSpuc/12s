package sep19_stak_opg1;

public class StackUse {

	public static <E> void reverse(E[] tabel) {
		StackI<E> stak = new ArrayStack<E>(tabel.length);
		// StackI<E> stak = new LinkedStack<E>();
		for (int i = 0; i < tabel.length; i++) {
			stak.push(tabel[i]);
		}
		int i = 0;
		while (!stak.isEmpty()) {
			tabel[i] = stak.pop();
			i++;
		}

	}

	public static void main(String[] args) {

		// Integer[] tal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// reverse(tal);
		// for (int i = 0; i < tal.length; i++) {
		// System.out.print(tal[i] + " ");
		// }

//		ListStack<Integer> liste = new ListStack<>();
//		System.out.println(liste.pop());
//		liste.push(5);
//		liste.push(6);
//		liste.push(7);
//		System.out.println(liste.isEmpty());
//		System.out.println(liste.peek());
//		System.out.println(liste.pop());
//		liste.clear();
//		System.out.println(liste.pop());
//		System.out.println(liste.peek());
//		
		
		
		
		String[] stringArray = { "ABCDDCBA", "ABCDEFGFEDCBA", "ABCCA", "JONAS", "A", "" };
		for (String s : stringArray) {
			System.out.print(checkPalindrom(s) + ", ");
		}

	}

	public static boolean checkPalindrom(String s) {
		int middle = s.length() / 2;
		StackI<Character> stak = new ArrayStack<Character>(middle);
		for (int i = 0; i < middle; i++) {
			stak.push(s.charAt(i));
			// System.out.println(s.charAt(i));
		}
		if (s.length() % 2 != 0) {
			middle++;
		}
		boolean result = true;
		int current = middle;
		while (result && current < s.length()) {
			Character c = stak.pop();
			if (!c.equals(s.charAt(current))) {
				result = false;
			} else {
				current++;
			}
		}
		return result;

	}

}
