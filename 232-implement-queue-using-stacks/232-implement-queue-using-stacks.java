class MyQueue {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> op = new Stack<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        peek();
        return op.pop();
    }
    
    public int peek() {
        if(op.isEmpty())
        {
            while(!in.isEmpty())
                op.push(in.pop());
        }
        return op.peek();
    }
    
    public boolean empty() {
        return (op.isEmpty() && in.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */