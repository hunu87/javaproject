package LinkedList;

public class LinkedLIstImpl implements LinkedList {
	
	public LinkedLIstImpl() {
		
	}
		
	@Override
	public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
		if(!this.isAvailablePosition(head, position))	throw new IndexOutOfBoundsException();
		
		// 아직 노드가 아예 없는 경우
		if(head == null) return nodeToAdd;
		
		// nodeToAdd 를 head에 위치 시키는 경우
		if(position == 0) {
			nodeToAdd.next = head;
			return nodeToAdd;
		}
		
		ListNode prevNode = getNodeAtThePosition(head, position-1);	// 삽입하려는 위치의 바로 이전 노드를 가져온다.
		nodeToAdd.next = prevNode.next;
		prevNode.next = nodeToAdd;
		
		return head;
	}
	
	@Override
	public ListNode remove(ListNode head, int positionToRemove) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean contains(ListNode head, ListNode nodeToCheck) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean isAvailablePosition(ListNode head, int position) {
		
		if(position < 0 || position > (getSize(head))) {
			return false;
		}
		
		return true;
	}
	
	public int getSize(ListNode head) {
		if (head == null) return 0;
		if (!hasNext(head)) return 1;
		
		ListNode node = head.next;
		int size = 2;
		
		while(hasNext(node)) {
			size++;
			node = head.next;
		}
		
		return size;
	}
	
	public ListNode getNodeAtThePosition(ListNode head, int position) {
		for(int i=0; i<position; i++) {
			head = head.next;
		}
		
		return head;
	}
	
	public boolean hasNext(ListNode head) {
		if(head.next == null) return false;
		return true;
	}
}
