class ComplexListNode{
	int val;
	ComplexListNode next;
	ComplexListNode sibling;
	ComplexListNode(int value){
		this.val = val;
		this.next = null;
		this.sibling = null;
	}
}
public class CloneComplexList{
	public ComplexListNode clone(ComplexListNode head){
		cloneNext(head);
		cloneSibling(head);
		return splitList(head);
	}
	private void cloneNext(ComplexListNode head){
		ComplexListNode p = head;
		while(p!=null){			
			ComplexListNode cloneNextNode =p.next;
			ComplexListNode cloneReplace = new new ComplexListNode(head.val);
			p.next = cloneReplace;
			cloneReplace.next = cloneNextNode;
			p= p.next;	
		}
	}
	private void cloneSibling(ComplexListNode head){
		ComplexListNode p =head;
		while(p!=null){
			ComplexListNode clone = p.next;
			if(p.sibling!=null){
				clone.sibling = p.sibling.next;
			}
			p.next  =clone.next;
		}
	}
	private ComplexListNode splitList(ComplexListNode head){
		ComplexListNode pNode = head;
		ComplexListNode pCloneHead = null;
		ComplexListNode pCloneNode = null;
		if(pNode !=null){
			pCloneHead = pCloneNode = pNode.next;
			pNode.next = pCloneNode.next;
		}
		while(pNode!=null){
			pCloneNode.next = pNode.next;
			pCloneNode = pCloneNode.next;
			pNode.next = pCloneNode.next;
			pNode=pNode.next;
		}
		return pCloneHead;
	}
}