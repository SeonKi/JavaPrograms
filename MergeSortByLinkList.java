
public class MergeSortByLinkList {

	private ListNode elements;
	
	public void insert(Cart element){
		if(elements==null){
			this.elements = new ListNode(element);
		}else {
			insert(this.elements, element);
		}
	}
	
	private void insert(ListNode node, Cart element){
		if(node.next==null){
			node.next = new ListNode(element);
		}else{
			insert(node.next, element);
		}
	}
		
	public void mergeSort(){
		this.elements = mergeSort(this.elements);
 	}
	
	private ListNode mergeSort(ListNode head){
 
		if (head == null || head.next == null)
			return head;
 
		// count total number of elements
		int count = 0;
		ListNode p = head;
		while (p != null) {
			count++;
			p = p.next;
		}
 
		// break up to two list
		int middle = count / 2;
 
		ListNode l = head, r = null;
		ListNode p2 = head;
		int countHalf = 0;
		while (p2 != null) {
			countHalf++;
			ListNode next = p2.next;
 
			if (countHalf == middle) {
				p2.next = null;
				r = next;
			}
			p2 = next;
		}
 
		// now we have two parts l and r, recursively sort them
		ListNode h1 = mergeSort(l);
		ListNode h2 = mergeSort(r);
 
		// merge together
		ListNode merged = merge(h1, h2);
 
		return merged;
	}
	
	private ListNode merge(ListNode l, ListNode r) {
		ListNode p1 = l;
		ListNode p2 = r;
 
		ListNode fakeHead = new ListNode(new Cart(0,"","",0));
		ListNode pNew = fakeHead;
 
		while (p1 != null || p2 != null) {
 
			if (p1 == null) {
				pNew.next = new ListNode(p2.val);
				p2 = p2.next;
				pNew = pNew.next;
			} else if (p2 == null) {
				pNew.next = new ListNode(p1.val);
				p1 = p1.next;
				pNew = pNew.next;
			} else {
				if (p1.val.getCustId() < p2.val.getCustId()) {
					// if(fakeHead)
					pNew.next = new ListNode(p1.val);
					p1 = p1.next;
					pNew = pNew.next;
				} else if (p1.val == p2.val) {
					pNew.next = new ListNode(p1.val);
					pNew.next.next = new ListNode(p1.val);
					pNew = pNew.next.next;
					p1 = p1.next;
					p2 = p2.next;
 
				} else {
					pNew.next = new ListNode(p2.val);
					p2 = p2.next;
					pNew = pNew.next;
				}
			}
		}
 
		// printList(fakeHead.next);
		return fakeHead.next;
	}
	
	public void display(){
		System.out.println("CUSTID, \tFIRSTNAME, \tLASTNAME, \tITEMNUMBER");
		display(elements);
		System.out.println();
	}
	
	private void display(ListNode node){
		if(node!=null){
			System.out.println(node.val.getCustId()+", \t"+node.val.getFirstName()+", \t\t"+node.val.getLastName()+", \t\t"+node.val.getItemNumber());
			display(node.next);
		}
	}

}
