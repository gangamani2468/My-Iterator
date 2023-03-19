package newIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import interfaces.Filter;
import interfaces.For;


public class MyIterator<E> extends IteratorAbstarct{
	List<Integer> hi=new ArrayList<>();

	ListIterator<?> list=hi.listIterator();
	 
	private E[] data;
	private int pos;
	
	public MyIterator(E[] data) {
	this.data=(E[]) data;
	pos=0;
	}
	@SuppressWarnings("unchecked")
	public MyIterator(List<E> arr) {
		this.data=(E[]) arr.toArray();
		//lis to array
		pos=0;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return pos<data.length;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		E value=(E) data[pos];
		
		pos++;
		return value;
	}
	
	
	
	public boolean hasPrevious() {
		return 0<pos;
	}
	
	
	
	
	
	public E previous() {
		
		if(pos==0) {
			throw new IndexOutOfBoundsException();
		}
		E value=(E) data[pos-1];
		pos--;
		return value;
	}
	
	
	
	
	
	public int nextIndex() {
		return pos;
	}
	
	
	
	
	public int prevIndex() {
		return pos-1;
	}
	
	
	
	
	public E firstElement() {
		E value=(E) data[0];
		return value;
	}
	
	
	
	public E lastElement() {
		E value =(E) data[data.length-1];
		return value;
	}
	
	public E sort() throws Exception {
				Arrays.sort(data);
			return (E) data;
	}
	public E[] sort(Comparator<? super E> compare) {
		Arrays.sort(this.data,compare);
		return data;
	}
	public void forEach(For<? super E> n) {
		if(n==null) {
			throw new NullPointerException();
		}
		for(E element:this.data) {
			n.test(element);
		}
	}
	public MyIterator<E> filter(Filter<? super E> n) {
		List<E> list = new ArrayList<>();
		for(E i:data) {
			if(n.fill(i)) {
				list.add(i);
			}
		}
		return new MyIterator<>((E[])list.toArray());
	}
}


