package DataStructure.JavaArrays.Stack;

import java.util.EmptyStackException;

public class Stack {
    private int capacity;//stores the length of the total data storing capacity of the stack;
    private int size=0;//store the total length of data stored in the stack
    private int top = -1;//stores the index of data at topmost at stack
    private int [] stack;
    public Stack(){
        this(20);//if size of stack not given by the user then it creates the stack of default size as 20
    }
    public Stack(int size){
        capacity = size;
        stack = new int[capacity];
    }

    //Adds data given by the user to the stack
    public void push(int data) throws StackOverflowError{
        if(capacity != size){
            stack[++top] = data;
            size++;
        }else {
            throw  new StackOverflowError("Stack is Full");
        }
    }

    //Returns the topmost data of the stack and logically removes data from the stack
    public int pop()throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            size--;
            return stack[top--];
        }
    }

    //Returns the topmost data of the stack
    public int peek() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return stack[top];
        }
    }

    //Checks whether the stack contains the given data or not
    public boolean contains(int element){
        for (int i = 0;i<=top;i++){
            if(stack[i]==element){
                return true;
            }
        }
        return false;
    }

    //Return the index of the data form top if stacks contains the data else returns -1;
    public int search(int element){
            int position = 1;
            int i;
            for(i = top,position = 1;i>=0;i--,position++){
                if(stack[i]==element){
                    return position;
                }
            }
        return -1;
    }

    //Checks whether the stack is empty or not
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString()throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }else{
            String string = "[ ";
            for(int i =0;i<=top;i++){
                string += stack[i] +", ";
            }
            string+="]";
            return string;
        }

    }
}
