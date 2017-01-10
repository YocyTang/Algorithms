public class Letcode_19{
	public ListNode removeNthFromEnd(ListNode head, int n){
		if(head == null){
			return null;
		}
		ListNode first = new ListNode(0);
		first.next = head;
		ListNode pre = first;
		ListNode follow= first;
		int count =0;
		while(pre!=null)
			if(count == n){
				break;
			}
			count++;
			pre = pre.next;
		}
		while(pre.next!=null){
			pre = pre.next;
			follow = follow.next;
		}
		ListNode memery = follow.next;
		follow.next = follow.next.next;
		memery.next = null;
		return first.next;
	}
}