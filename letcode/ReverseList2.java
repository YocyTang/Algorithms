public ListNode reverseList(ListNode head, int m, int n){
	ListNode first = new ListNode(0);
	first.next = head;
	ListNode tail = first;
	int count = 0;
	while(count!=m-1){
		count++;
		tail = tail.next;
	}
	ListNode next = tail.next;
	tail.next = null;

	ListNode pre = next.next;
	ListNode taimM = next;
	while(count!=n){
		count++;
		ListNode tailT = tail.next;

		pre = next.next;
		tail.next = next;
		next.next = tailT;
		next = pre;
	}
	taimM.next = pre;
	return first.next;
}