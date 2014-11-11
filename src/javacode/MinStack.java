package javacode;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minS = new Stack<Integer>();
    
    public void push(int x) {
        if(minS.isEmpty() || x <= minS.peek())
            minS.push(x);
        stack.push(x);
    }

    public void pop() {
        if(stack.peek().equals(minS.peek()))
            minS.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minS.peek();
    }
    
    public static void main(String[] args){
    	MinStack ms = new MinStack();
    	ms.push(512);
    	ms.push(-1024);
    	ms.push(-1024);
    	ms.push(512);
    	ms.pop();
    	System.out.println(ms.getMin());
    	ms.pop();
    	System.out.println(ms.getMin());
    	ms.pop();
    	System.out.println(ms.getMin());
    }
}