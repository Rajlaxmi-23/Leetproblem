class MyQueue {
   private Deque<Integer> instack;
   private Deque<Integer> outstack;

    public MyQueue() {
        instack = new ArrayDeque<>();
        outstack = new ArrayDeque<>();

        
    }
    
    public void push(int x) {
        instack.push(x);
        
    }
    
    public int pop() {
        moveIFNeed();
        return outstack.pop();
        
    }
    
    public int peek() {
        moveIFNeed();
        return outstack.peek();
        
    }
    
    public boolean empty() {
        if(instack.isEmpty() && outstack.isEmpty()){
            return true;
        }
        return false;
    
        
    }
    public void moveIFNeed(){
        if(outstack.isEmpty()){
            while(!instack.isEmpty()){
                outstack.push(instack.pop());
            }
        }
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