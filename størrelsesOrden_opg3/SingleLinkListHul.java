package størrelsesOrden_opg3;

public class SingleLinkListHul<E extends Comparable<E>> {

	private Node firstNode; // reference to first node
	private int numberOfEntries;

	public SingleLinkListHul() {
		firstNode = null;
		numberOfEntries = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på E
	 * 
	 * @param e
	 */
	// public void addElement(E e) {
	// Node newNode = new Node();
	// newNode.data = e;
	// Node currentNode = firstNode;
	// if (currentNode != null) {
	// boolean found = false;
	// while (!found) {
	// if (newNode.data.compareTo(currentNode.data) > 0) {
	// found = true;
	//
	// } else {
	// currentNode = currentNode.next;
	// }
	// }
	//
	// }
	// newNode.next = currentNode;
	// firstNode = newNode;
	//
	// numberOfEntries++;
	//
	// }

	public void addElement(E e) {

		// if (firstNode == null) {
		// firstNode = new Node();
		// firstNode.data = e;
		// } else {
		// Node newNode = new Node();
		// newNode.data = e;
		// Node currentNode = firstNode;
		// boolean found = false;
		// while (!found && currentNode.next != null) {
		// if (newNode.data.compareTo(currentNode.next.data) > 0) {
		// found = true;
		// } else {
		// currentNode = currentNode.next;
		// }
		// newNode.next = currentNode.next;
		// currentNode.next = newNode;
		// }
		// }
		// numberOfEntries++;

		Node newNode = new Node();
		Node currentNode = firstNode;

		if (currentNode == null) {
			newNode.data = e;
			newNode.next = firstNode;
			firstNode = newNode;

		} else if (currentNode.data.compareTo(e) > 0) {
			newNode.data = e;
			newNode.next = currentNode;
			firstNode = newNode;

		} else {

			while (currentNode.next != null && currentNode.next.data.compareTo(e) < 0) {
				currentNode = currentNode.next;
			}

			newNode.data = e;
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
		numberOfEntries++;
	}

	/**
	 * Fjerner den første forrekomst af e i listen, listen er fortsat sorteret i
	 * henhold til den naturlige ordning på E Returner true hvis e blev fjernet
	 * fra listen ellers returneres false
	 * 
	 * @param e
	 */
	public boolean deleteElement(E e) {
		boolean found = false;
		if (firstNode != null) {
			Node currentNode = firstNode;
			if (currentNode.data.equals(e)) {
				firstNode = currentNode.next;
				currentNode.next = null;
				found = true;
			}
			while (currentNode.next != null && !currentNode.next.data.equals(e)) {
				currentNode = currentNode.next;
			}
			if (currentNode.next != null) {
				currentNode.next = currentNode.next.next;
				found = true;
			}
		}
		if (found) {
			numberOfEntries--;
		}
		return found;
	}

	/**
	 * Udskriver elementerne fra liste i sorteret rækkefølge
	 **/
	public void udskrivElements() {
		Node currentNode = firstNode;
		int i = 0;
		while (i < numberOfEntries && currentNode != null) {
			System.out.println(currentNode.data.toString());
			i++;
			currentNode = currentNode.next;
			// System.out.println(i);
			// System.out.println(numberOfEntries);
		}
	}

	/*
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {

		return numberOfEntries;
	}

	/**
	 * tilf�jer alle elementerne fra list til den aktuelle liste. Listen er
	 * fortsat sorteret i henhold til den naturlige ordning p� E
	 * 
	 * @param list
	 */
	public void addAll(SingleLinkListHul<E> list) {
		Node currentNode = list.firstNode;
		if (currentNode != null) {
			this.addElement(currentNode.data);
		}
		while (currentNode.next != null) {
			this.addElement(currentNode.next.data);
			currentNode = currentNode.next;
		}
	}

	private class Node {
		private E data; // entry in bag
		private Node next; // link to next node
	}

}
