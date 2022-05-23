import java.util.ArrayList;

public class MyStack {

	private ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		int size = getSize();
		Object o = list.get(size-1);
		return o;
	}

	public Object pop() {
		int size = getSize();
		Object o = list.get(size-1);
		list.remove(size-1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}

