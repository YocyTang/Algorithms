class Stack<T>{
	private LinkedList<T> me;
	public Stack(){
		me  = new LinkedList<T>();
	}
	public void push(T item){
		me.addFirst(item);
	}
	public T pop(){
		return me.removeFirst();
	}
	public int size(){
		return me.size();
	}
}
public class StackToQueue{
	private Stack<T> stack1 = new Stack<T>();
	private Stack<T> stack2 = new Stack<T>();
	public void appendTail(T item){
		stack1.push(item);
	}
	public T deleteHead(){
		if(stack2.size<=0){
			while(stack1.size>0){
				stack2.push(stack1.pop());
			}
		}else{
			return stack2.pop();
		}
	}
}