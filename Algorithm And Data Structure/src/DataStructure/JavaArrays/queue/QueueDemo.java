package DataStructure.JavaArrays.queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.poll());
        for (int i = 10;i<200;i+=10){
            if (queue.add(i)) {
                System.out.println(i + " is added");
            } else {
                System.out.println(i + " is not added");
            }
        }
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove());

    }
}
