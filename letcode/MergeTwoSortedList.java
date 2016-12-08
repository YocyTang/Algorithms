public ListNode MergeTwoSortedList(ListNode l1, ListNode l2){
	ListNode first= new ListNode(0);
	ListNode pre = first;
	while(l1!=null && l2!=null){
		if(l1.val<=l2.val){
			pre.next = l1;
			l1 = l1.next;
		}else{
			pre.next = l2;
			l2 = l2.next;
		}
		pre = pre.next;
	}
	if(l1 != null){
		pre.next = l1;
	}
	if(l2 !=null){
		pre.next = l2;
	}
	return first.next;
}