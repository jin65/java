
public class IStack implements Stack {
	private int stack[];
	private int top;
	public IStack(int size) {
		stack=new int[size];
		top=-1;
	}
	public void push(int item) {
		stack[++top]=item;
	}
	public int pop() {
		return stack[top--];
	}
	public void stackPrint() {
		for(int i=0; i<=top; i++)
			System.out.print(stack[i]+" ");
	}
	public int getTop() {
		return top;
	}
}
