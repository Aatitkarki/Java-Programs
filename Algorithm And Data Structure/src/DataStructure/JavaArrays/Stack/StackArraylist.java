package DataStructure.JavaArrays.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackArraylist {
    private int size=0;
    private int top=-1;
    private ArrayList<Integer> stack;


    public StackArraylist(){
        stack =new ArrayList<Integer>();
    }

    public void push(int data){
        stack.add(++top,data);
        size++;
    }
    public int pop()throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        size--;
        return stack.get(top--);
    }

    public int peek()throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(top);
    }

    public boolean isEmpty(){
        return size ==0;
    }
    public int search(int element){
        int position;
        int i=0;
        for(i =top,position = 1;i>=0;i--,position++){
            if(stack.get(i)==element){
                return position;
            }
        }return -1;

    }
    public boolean contains(int element){
        for(int i =0;i<=top;i++){
            if(stack.get(i)==element){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }else{
            String string = "[ ";
            for(int i =0;i<=top;i++){
                string += stack.get(i) +", ";
            }
            string+="]";
            return string;
        }

    }

}
