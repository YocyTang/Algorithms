public class Solution{
	public boolean hasCycle(ListNode head){
		if(head == null || head.next == null){
			return false;
		}
		ListNode faster = head;
		ListNode slower = head;
		while(faster.next != null && faster.next.next != null){
			faster = faster.next.next;
			slower = slower.next;
			if(faster == slower ){
				return true
			}
		}
		return false;
	}
}