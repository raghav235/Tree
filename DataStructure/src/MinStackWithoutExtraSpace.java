import java.util.Stack;

public class MinStackWithoutExtraSpace {

	public static void main(String[] args) {

		MinStack stack= new MinStack();
		stack.push(5);
		System.out.println(stack.getMinimum());
		stack.push(3);
		
		System.out.println(stack.top());
		System.out.println(stack.getMinimum());
	
		System.out.println(stack.pop());
		System.out.println(stack.getMinimum());
	}

}

class MinStack{
	
	
	private Stack<Integer> stack;
	private int min;
	
	public MinStack(){
		this.stack= new Stack<>();
	}
	
	int getMinimum(){
		return stack.isEmpty()?-1: min;
	}
	
	int top(){
		int top=stack.peek();
		return (top<min)? min: top;
	}
	
	void push(int item){
		if(stack.isEmpty()){
			stack.push(item);
			min=item;
		}
		else{
			if(item>=min){
				stack.push(item);
			}
			else if(item < min){
				stack.push((2*item)-min);
				min=item;
			}
		}
	}
	
	int pop(){
		int result = -1;
		if(stack.isEmpty()){
			return result;
		}
		else{
			int poppedItem=stack.pop();
			if(poppedItem<min){
				result=min;
				min=2*min-poppedItem;
			}
			else if(poppedItem>=min){
				return poppedItem;
			}
		}
		
		return result;
	}
}
