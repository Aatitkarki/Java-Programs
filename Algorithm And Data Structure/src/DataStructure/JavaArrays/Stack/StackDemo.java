package DataStructure.JavaArrays.Stack;

public class StackDemo {
    public static void main(String [] args){
        StackArraylist mystack =new StackArraylist();
        System.out.println(mystack.isEmpty());
        for(int i = 10;i<=600;i+=10){
            mystack.push(i);
        }
        System.out.println(mystack.peek());
        System.out.println(mystack.peek());
        System.out.println(mystack.search(90));
        System.out.println(mystack.contains(12));
        System.out.println(mystack.toString());
    }
}
