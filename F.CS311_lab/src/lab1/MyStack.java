package lab1;

public class MyStack {
	private int size;
	private int[] s;
	private int top;

	public MyStack(int size) {
		this.size = size;
		s = new int[size];
		top = -1;
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			s[top] = element;
		}
	}

	public int peek() {
		return s[top];
	}

	public int pop() {
		return s[top--];
	}

	public Boolean isEmpty() {
		return (top == -1);
	}

	public Boolean isFull() {
		return (top == size - 1);
	}

	public void printStack() {
		System.out.println("Stack: ");

		for (int i = 0; i < size; i++) {
			System.out.println("" + (int) s[i]);
		}
	}

}

