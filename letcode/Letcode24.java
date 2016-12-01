public ListNode swapPairs(ListNode head){
	if(head == null || head.next == null){
		return head;
	}
	ListNode h = new ListNode(0);
	h.next = head;
	ListNode p = h;
	while(p.next!=null&&p.next.next!= null){
		ListNode t = p;
		p = p.next;
		t = p.next;
		ListNode x = p.next.next;
		p.next.next = p;
		p.next= x;
	}
	return  h.next;
}