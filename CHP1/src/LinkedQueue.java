import java.util.Iterator;

/*
 * 链式队列实现
 */
public class LinkedQueue<Item> implements Iterable<Item> {
	private Node<Item> first;
	private Node<Item> last;
	private int len;
	
	
	public LinkedQueue() {
		super();
	}
	
	public boolean isEmpty() {
		return len==0;
	}
	
	public int size() {
		return len;
	}
	
	//入队
	public void enqueue(Item item) {
		Node<Item> tmp = new Node<>();
		tmp.data=item;
		if(len==0) { //队列为空时入队的情况
			first=last=tmp;
		}
		else {
			last.next=tmp;
			last=tmp;
		}
		len++;
	}
	
	//出队
	public Item dequeue() {
		Item tmp = first.data;
		if(len==1) { //队列中只有一个元素时出队的情况
			first=last=null;
		}
		else {
			first=first.next;
		}
		len--;
		return tmp;
	}
	
	//结点
	private class Node<Item>{
		Item data;
		Node<Item> next;
	}

	@Override
	public Iterator<Item> iterator() {
		return new QueueIterator();
	}
	
	//队列迭代器
	private class QueueIterator implements Iterator<Item>{
		Node<Item> current = first;
		@Override
		public boolean hasNext() {
			return current!=null;
		}

		@Override
		public Item next() {
			Item item = current.data;
			current=current.next;
			return item;
		}
		
	}

}
