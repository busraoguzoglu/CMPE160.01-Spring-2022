import java.util.ArrayList;

@SuppressWarnings("serial")
public class MySecondStack extends ArrayList<Object>{

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return super.size();
	}

	public Object peek() {
		int size = getSize();
		Object o = super.get(size-1);
		return o;
	}

	public Object pop() {
		int size = getSize();
		Object o = super.get(size-1);
		super.remove(size-1);
		return o;
	}

	public void push(Object o) {
		super.add(o);
	}

	@Override
	public String toString() {
		return "stack two: " + super.toString();
	}
}

