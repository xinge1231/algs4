import java.util.Iterator;

/*
 * 链栈实现
 */
public class LinkedStack<Item> implements Iterable<Item>{
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

	@Override
	public Iterator<Item> iterator() {
		return new StackIterator();
	}
	
	//栈迭代器
	private class StackIterator implements Iterator<Item>{
		private Node<Item> current = first;
		@Override
		public boolean hasNext() {
			return current!=null;
		}

		@Override
		public Item next() {
			Item item=current.data;
			current=current.next;
			return item;
		}
		
	}

}
