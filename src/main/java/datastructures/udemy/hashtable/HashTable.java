package datastructures.udemy.hashtable;

public class HashTable {

	private int size = 7;
	private Node[] dataMap;

	public HashTable() {
		this.dataMap = new Node[size];
	}

	class Node {
		private String key;
		private int value;
		private Node next;

		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	public void printMap() {
		for (int i = 0; i < dataMap.length; i++) {
			System.out.println(i + ":");
			Node temp = dataMap[i];
			while (temp != null) {
				System.out.println("{" + temp.key + "=" + temp.value + "}");
				temp = temp.next;
			}
		}
	}

	public int get(String key) {
		int index = hash(key);
		Node temp = dataMap[index];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			} else {
				temp = temp.next;
			}
		}
		return 0; 			// zero quantity of items
	}

	public void set(String key, int value) {
		int index = hash(key);
		Node newNode = new Node(key, value);
		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	private int hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray(); 		// puts our String into an array of characters
		for (int i = 0; i < keyChars.length; i++) {

			int asciiValue = keyChars[i]; 		// This gives us the ASCII numeric value of each letter

			// 23 is a prime number and if you multiply a value by a prime number the number you will
			// get is more random (apparently). Modulo 7 is going to have a remainder of something in between 0 and 6.
			hash = (hash + asciiValue * 23) % dataMap.length;
		}
		return hash;
	}
}
