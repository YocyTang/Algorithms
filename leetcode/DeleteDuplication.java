public ListNode deleteDuplicationNode(ListNode head){
	if(head == null || head.next == null){
		return head;
	}
	ListNode first = new ListNode(0);
	first.next = head;
	ListNode tail = first;
	while(tail.next!=null && tail.next.next!= null){
	
		ListNode next = tail.next;
		ListNode nextNext = next.next;
		if(next.val == nextNext.val){
			tail.next = nextNext.next;
		}else{
			tail = next;
		}
	}
	return first.next;
}