public class ReverseList{
	public ListNode reverse(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode follow = null;
		ListNode pre = head;
		ListNode reverseHead = null;
		while(pre!=null){
			ListNode next = pre.next;
			if(pre.next == null){
				reverseHead = pre;
			}
			pre.next = follow;
			follow = pre;
			pre = next;
		}
		return reverseHead;
	}
	public ListNode reverse2(ListNode head){
		if(head == null){
			return null;
		}
		ListNode first = new ListNode(0);
		ListNode pre = head;
		while(pre!=null){
			ListNode next = pre.next;
			pre.next = first.next;
			first.next = pre;
			pre = next;
		}
		return first.next
	}
	public ListNode reverse3(ListNode head){
		
		ListNode first = new ListNode(0);
		reverse3(head, first);
		return first.next;
	}
	private ListNode reverse3(ListNode head, ListNode first){
		if(head == null){
			return;
		}
		reverse3(head.next, first);
		first.next = head;
	}
}