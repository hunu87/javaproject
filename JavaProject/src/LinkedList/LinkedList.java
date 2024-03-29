package LinkedList;

public interface LinkedList {
	public ListNode add(ListNode head, ListNode nodeToAdd, int position);
	public ListNode remove(ListNode head, int positionToRemove);
	public boolean contains(ListNode head, ListNode nodeToCheck);
}
