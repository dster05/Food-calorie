import java.util.*;

class SStackMethods{
String[] stack;
int tos;// top of stack
int capacity;//total capacity of the stack
int size;// current number of elements
String error = "Error";

	//default constructor, creates a stack of size 10
public SStackMethods(){
this.stack = new String[10];
this.tos = -1;
this.capacity = 10;
this.size = 0;
this.error = "Error";
}
	//overloaded constructor, creates a stack for the user defined value
public SStackMethods(int arraySize){
this.stack = new String[arraySize];
this.tos = -1;
this.capacity = arraySize;
this.size = 0;
this.error = "Error";
}

	//push() for stack
public void push(String value){
	if(size == capacity){
		System.out.println("Stack Overflow");
		return;
	}
	stack[++tos] = value;
	this.size++;
}
//because of the the instructions are entered the stack my seam to pop backwords

	//pop() for stack
public String pop(){
	if(isEmpty()){
		System.out.println("Stack Underflow");
		return error;
	}
	String temp = stack[tos];//element to return
	tos--;
	size--;
	return temp;
}

public boolean isEmpty(){
	if(tos == -1){
		return  true;
	}
	return false;
}

public String takePeek(){
	if(tos == -1){
		System.out.println("Stack is empty");
	}
	return stack[tos];
}

public void display(){
	int counter = 1;
	for(int i = size-1 ; i >= 0; i--){
	
		System.out.println(counter+"   "+stack[i]);
		counter++;
	}
	System.out.println("");
}

}


public class SStackMethodsDemo{
	public static void main(String[] args){
		SStackMethods newStack = new SStackMethods(10);
		newStack.push("Jonathan");
		newStack.push("Dustin");
		newStack.push("Robin");
		newStack.push("debbie");
		newStack.push("richard");
		newStack.display();
		System.out.println("");
		newStack.pop();
		newStack.display();
		System.out.println("");
		newStack.pop();
		newStack.display();
		System.out.println("");
		newStack.pop();
		newStack.display();
	

		
	}
}