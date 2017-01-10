public ListNode add(ListNode l1, ListNode l2){
	ListNode res = help(reverse(l1), reverse(l2), 0);
	return reverse(res);
}
private ListNode help(ListNode l1, ListNode l2, int carry){
	if(l1 == null && l2 == null){
		return carry == 0? null: new ListNode(carry);

	}
	if(l1 == null ){
		l1 = new ListNode(0);

	}
	if(l2 == null){
		l2 = new ListNode(0);
	}

	int sum = l1.val + l2.val+carry;
	ListNode curr = new ListNode(sum %10);
	curr.next = help(l1.next, l2.next, sum /10);
	return curr;
}
private ListNode reverse(ListNode head){
	ListNode first  = new ListNode(0);
	while(head!=null){
		ListNode next = head.next;
		ListNode firstNext = first.next;
		first.next = head;
		head.next = firstNext;
		head = next;
	}
	return first.next;
}