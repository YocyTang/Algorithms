public void DeleteNode(ListNode head, ListNode target){
	//O(1)时间内删除指定节点
	if(head== null || target == null){
		return;
	}
	if(head.next!=null&& target.next!=null){
		ListNode next = target.next;
		target.val = next.val;
		target.next = next.next;
	}else if(head.next == null){
		head = null;
	}else{
		ListNode pre = head;
		while(pre.next!= target){
			pre = pre.next;
		}
		pre.next = null;

	}
}