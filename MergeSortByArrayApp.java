
public class MergeSortByArrayApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Insert elements - Need to modify below
		MergeSortByArray merge = new MergeSortByArray(10);
		merge.insert(new Cart(100011, "Joe", "Frank", 6589));
		merge.insert(new Cart(100005, "Lu", "Peter", 3453));
		merge.insert(new Cart(100002, "Idan", "Sun", 2345));
		merge.insert(new Cart(100003, "App", "Teen", 6753));
		merge.insert(new Cart(100012, "George", "Peter", 7867));
		merge.insert(new Cart(100001, "Fun", "Tree", 2243));
		merge.insert(new Cart(100030, "George", "Peter", 7867));
		merge.insert(new Cart(100010, "Fun", "Tree", 2243));

		
		// Display Elements below
		System.out.println("Before Sorting");
		merge.display();
		
		merge.mergeSort();
		
		// Display Elements below
		System.out.println();
		System.out.println("Sorted Based on Cust Id");
		merge.display();

	}

}
