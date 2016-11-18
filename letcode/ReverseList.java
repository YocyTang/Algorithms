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
}