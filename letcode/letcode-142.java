public class Solution{
	public ListNode detectCycle(ListNode head){
		if(head == null || head.next == null){
			return null;
		}
		ListNode slower = head;
		ListNode faster = head;
		while(faster.next != null && faster.next.next != null){
			slower = slower.next;
			faster = faster.next.next;
			if(slower == faster){
				break;
			}
		}
		if(faster.next == null && faster.next.next == null){
			return null;
		}
		slower = head;
		while(slower!=faster){
			slower = slower.next;
			faster = faster.next;
		}
		return faster;
	}
}