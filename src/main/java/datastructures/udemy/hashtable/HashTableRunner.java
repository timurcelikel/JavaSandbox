package datastructures.udemy.hashtable;

public class HashTableRunner {

	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.printMap();
		ht.set("nails", 100);
		ht.set("tile", 50);
		ht.set("lumber", 80);
		ht.set("bolts", 200);
		ht.set("screws", 140);
		ht.printMap();
		System.out.println(ht.get("nails"));
		System.out.println(ht.get("staples"));
	}
}
