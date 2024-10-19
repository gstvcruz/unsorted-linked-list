public class Main {
    public static void main(String[] args) throws Exception { 
        LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }
        Integer topOfStack = stack.top();
        String fullStack = stack.toString();
        boolean stackHas5 = stack.has(5);
        boolean stackHas10 = stack.has(10);
        while(stack.size() != 0) {
            stack.pop();
        }
        String emptyStack = stack.toString();

        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for(int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        Integer headOfQueue = queue.head();
        String fullQueue = queue.toString();
        boolean queueHas5 = queue.has(5);
        boolean queueHas10 = queue.has(10);
        while(queue.size() != 0) {
            queue.dequeue();
        }
        String emptyQueue = queue.toString();
    }
}
