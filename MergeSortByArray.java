
public class MergeSortByArray {
	
	private Cart[] elements;
	private int maxSize;
	private int index;
	
	private Cart[] helper;
	
	public MergeSortByArray(int size){
		this.maxSize = size;
		this.index = 0;
		elements = new Cart[maxSize];
	}
	
	public void insert(Cart element){
		if(this.index < this.maxSize){
			elements[index] = element;
			this.index++;
		}
	}
		
	public void mergeSort(){
	    this.helper = new Cart[this.index];
	    mergeSort(0, index - 1);
 
	}
	
	private void mergeSort(int low, int high){
	    // check if low is smaller then high, if not then the array is sorted
	    if (low < high) {
	      // Get the index of the element which is in the middle
	      int middle = low + (high - low) / 2;
	      // Sort the left side of the array
	      mergeSort(low, middle);
	      // Sort the right side of the array
	      mergeSort(middle + 1, high);
	      // Combine them both
	      merge(low, middle, high);

	    }
	}
	
	private void merge(int low, int middle, int high) {

	    // Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      helper[i] = elements[i];
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= middle && j <= high) {
	      if (helper[i].getCustId() <= helper[j].getCustId()) {
	    	  elements[k] = helper[i];
	        i++;
	      } else {
	    	  elements[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	    	elements[k] = helper[i];
	      k++;
	      i++;
	    }

	  }
	
	public void display(){
		System.out.println("CUSTID, \tFIRSTNAME, \tLASTNAME, \tITEMNUMBER");
		for (int i = 0; i < index; i++) {
			System.out.println(this.elements[i].getCustId()+", \t"+this.elements[i].getFirstName()+", \t\t"+this.elements[i].getLastName()+", \t\t"+this.elements[i].getItemNumber());
		} 
	}

}
