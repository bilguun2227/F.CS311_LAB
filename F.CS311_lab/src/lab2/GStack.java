package lab2;

public class GStack<G> {
	private int size;
	private G[] s;
	private int top;

	public GStack(int size) {
		this.size = size;
		this.s = (G[]) new Object[size];
		top = -1;
	}

	public void push(G element) {
		if (!isFull()) {
			top++;
			s[top] = element;
		}
	}

	public G peek() {
		return s[top];
	}

	public G pop() {
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
			System.out.println("" + (G) s[i]);
		}
	}
}


