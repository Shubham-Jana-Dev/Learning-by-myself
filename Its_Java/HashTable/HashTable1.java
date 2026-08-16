import java.util.Hashtable;

public class HashTable1{
	public static void main(String[] args){
		Hashtable<Integer, String> myHashTable = new Hashtable<>();
		myHashTable.put(34, "Shubham Jana");
		myHashTable.put(45, "Rajesh Mukharjee");
		myHashTable.put(56, "Dipak Majhi");
		myHashTable.put(99, "Ram Charan");
		System.out.println(myHashTable);
		myHashTable.remove(99);
		System.out.println(myHashTable);
		if(myHashTable.containsKey(34)){
			System.out.println("Yes "+ myHashTable.get(34) + " is present in the record ");
		}
	}
}