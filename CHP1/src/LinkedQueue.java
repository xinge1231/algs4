
public class LinkedQueue<Item> {
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
	private class Node<Item>{
		Item data;
		Node<Item> next;
	}

}
