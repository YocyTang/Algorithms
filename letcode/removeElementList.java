//移除链表中值为输入的元素
public ListNode removeElementList(ListNode head, int target){
	if(head == null){
		return null;
	}
	ListNode first = new ListNode(0);
	first.next = head;
	ListNode tail = first;
	while(tail!=null&& tail.next!=null){
		if(tail.next == target){
			tail.next = tail.next.next;
		}else {
			tail = tail.next;
		}
	}
	return first.next;
}