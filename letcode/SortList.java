//merge  链表的归并排序
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


//quickSort 链表快速排序
public ListNode SortList2(ListNode head){
	if (head== null || head.next == null) {
		return head;
	}
	ListNode mid = getMid(head);
	ListNode leftHead= new ListNode(0);
	ListNode leftTail = leftHead;
	ListNode rightHead = new ListNode(0);
	ListNode rightTail = rightHead;
	ListNode midHead = new ListNode(0);
	ListNode midTail = midHead;
	while(head!=null){
		if(head.val<mid.val){
			leftTail.next = head;
			leftTail =head;
		}else if(head.val>mid.val){
			rightTail.next = head;
			rightTail = head;
		}else{
			midHead.next = head;
			midHead = head;
		}
		head = head.next;
	}
	leftTail.next = null;
	midTail.next = null;
	rightTail.next = null;
	ListNode left = SortList2(leftHead.next);
	ListNode right = SortList2(rightHead.next);
	return concat(left,  midHead.next, right);
}
private ListNode concat(ListNode left, ListNode mid, ListNode right){
	ListNode head = new ListNode(0);
	ListNode tail = head;
	tail.next=left;
	tail = getTail();
	tail.next = mid;
	tail = getTail();
	tail.next = right;
	tail = getTail();
	return head.next;
}
private ListNode getTail(ListNode head){
	if(head== null || head.next == null){
		return head;
	}
	while(head.next!=null){
		head= head.next
	}
	return head;
}

