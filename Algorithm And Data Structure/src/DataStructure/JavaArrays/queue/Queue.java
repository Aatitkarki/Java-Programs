package DataStructure.JavaArrays.queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue {
    private int capacity;
    private int size=0;
    private int head=0;
    private int tail=0;
    private int [] queue;

    public Queue(){
        this(20);
    }
    public Queue(int size){
        capacity = size;
        queue = new int[capacity];
    }

    public boolean add(int data)throws IllegalStateException{
        if(size!=capacity){
            size++;
            queue[tail++]=data;
            return true;
        }
        else {
            throw new IllegalStateException();
        }
    }
    public int remove()throws NoSuchElementException{
        if(size!=0){
            size--;
            capacity--;
            return queue[head++];
        }else{
            throw new NoSuchElementException();
        }
    }
    public int element()throws NoSuchElementException {
        if(size!=0){
            return queue[head];
        }else{
            throw new NoSuchElementException();
        }

    }
    public boolean offer(int data){
        if(size!=capacity){
            size++;
            tail++;
            queue[head]=data;
            return true;
        }
        else {
            return false;
        }

    }
    public int poll(){
        if(size!=0){
            size--;
            capacity--;
            return queue[head++];
        }else{
            return 0;
        }

    }
    public int peek(){
        if(size!=0){
            return queue[head];
        }else{
            return 0;
        }

    }

}
