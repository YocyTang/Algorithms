public class PrintReversedList{
	public static void printList(ListNode head){
		if(head == null){
			return;
		}
		printList(head.next);
		System.out.println(head.val);
	}
}