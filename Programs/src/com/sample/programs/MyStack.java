package com.sample.programs;

public class MyStack {

	private int maxSize;
	private long[] stackArray;
	private int top;

	public MyStack(int size) {
		this.maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long i) {
		stackArray[++top] = i;
	}

	public long pop() {
		return stackArray[top--];
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		while(!stack.isEmpty()){
			long value = stack.pop();
			System.out.println(value);
		}
		System.out.println("");
	}

}
