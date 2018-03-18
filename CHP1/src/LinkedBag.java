import java.util.Iterator;
/*
 * 背包实现
 */
public class LinkedBag<Item> implements Iterable<Item> {
	private Node<Item> first;
	private int len;

	public LinkedBag() {
		super();
	}

	public int size() {
		return len;
	}

	public boolean isEmpty() {
		return first == null; // 或len==0
	}
	
	//添加元素
	public void add(Item item) {
		Node<Item> tmp = new Node<>();
		tmp.data = item;
		tmp.next = first;
		first = tmp;
		len++;
	}
	
	
	//结点
	private class Node<Item> {
		Item data;
		Node<Item> next;
	}


	@Override
	public Iterator<Item> iterator() {
		return new BagIterator();
	}
	
	//背包迭代器
	private class BagIterator implements Iterator<Item>{
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
