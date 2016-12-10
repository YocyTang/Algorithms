public ListNode SortList(ListNode head){
	if(head == null || head.next==null){
		return head;
	}
	ListNode mid = getMid(head):
	ListNode right = SortList(mid.next);
	mid.next =  null;
	ListNode left = SortList(head);
	return merge(left, right);
}
private ListNode getMid(ListNode head){
	ListNode slow  = head;
	ListNode fast = head.next;
	while(fast!=null && fast.next!=null){
		fast = fast.next.next;
		slow = slow.next;
	}
	return slow;
}
private ListNode merge(ListNode l1, ListNode l2){
	ListNode first = new ListNode(0);
	ListNode pre = first;
	while(l1!=null && l2 != null){
		if(l1.val<=l2.val){
			pre.next = l1;
			l1 = l1.next;
		}else{
			pre.next = l2;
			l2= l2.next;
		}
		pre = pre.next;
	}
	return first.next;
}