/*
 * 链栈实现
 */
public class LinkedStack<Item> {
	private Node<Item> first;
	private int len;

	public LinkedStack() {
		super();
	}

	public int size() {
		return len;
	}

	public boolean isEmpty() {
		return first == null; // 或len==0
	}
	
	//压栈
	public void push(Item item) {
		Node<Item> tmp = new Node<>();
		tmp.data = item;
		tmp.next = first;
		first = tmp;
		len++;
	}
	
	//出栈
	public Item pop() {
		Item tmp = null;
		if(!isEmpty()) {
			tmp = first.data;
			first = first.next;
			len--;
		}
		return tmp;
		
	}
	
	//结点
	private class Node<Item> {
		Item data;
		Node<Item> next;
	}

}
