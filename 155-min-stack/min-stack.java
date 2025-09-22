class MinStack {
    Stack <Integer> minStack;
    Stack <Integer> mainStack;

    public MinStack() {
        minStack = new Stack<>();
        mainStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty() || val < minStack.peek()){
            minStack.push(val);
        }
        else{
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
 
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */