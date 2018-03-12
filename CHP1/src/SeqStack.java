import java.util.Iterator;

/*
 * �Զ���ջ
 */
public class SeqStack<Item> implements Iterable<Item> {
	private Item[] items;
	private int len;

	public SeqStack(int cap) {
		super();
		len = 0;
		items = (Item[]) new Object[cap];
	}

	public int size() {
		return len;
	}

	public boolean isEmpty() {
		return len == 0;
	}
	
	//����ջ����
	private void resize(int cap) {
		Item[] tmp = (Item[]) new Object[cap];
		for (int i = 0; i < len; i++) {
			tmp[i] = items[i];
		}
		items = tmp; 
	}

	public void push(Item item) {
		if (len == items.length)
			resize(len * 2); //��̬��������
		items[len++] = item;
	}

	public Item pop() {
		Item tmp = null;
		if (len > 0 && len <= items.length / 4)
			resize(items.length / 2); //��̬��������
		if (!isEmpty()) {
			tmp = items[--len];
			items[len]=null; //�����������
		}
		return tmp;
	}

	@Override
	public Iterator<Item> iterator() {
		return new StackIterator();
	}
	
	//�������ڲ���
	private class StackIterator implements Iterator<Item>{
		private int i = len;
		@Override
		public boolean hasNext() {
			return i>0;
		}

		@Override
		public Item next() {
			return items[--i];
		}
			
	}

}
