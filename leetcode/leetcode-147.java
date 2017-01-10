public class Solution{
	public ListNode insertSort(ListNode head){
		if(head == null){
			return null;
		}
		ListNode p = new ListNode(0);
		
		ListNode pre = p;
		ListNode cur = head;
		while(cur!= null){
			ListNode next = cur.next;
			pre = p;
			while(pre.next != null&& pre.next.val < cur.val){
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			cur = next;
		}
		return p.next;
	}
}