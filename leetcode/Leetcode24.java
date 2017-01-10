public ListNode swapPairs(ListNode head){
	if(head == null || head.next == null){
		return head;
	}
	ListNode first = new ListNode(0);
	first.next = head;
	ListNode curr = first;
	while(curr.next!=null && curr.next.next!=null){
		ListNode follow = curr.next;
		ListNode pre = curr.next.next;
		curr.next = pre;
		follow.next = pre.next;
		pre.next = follow;
		curr = follow;
	}
	return first.next;
}