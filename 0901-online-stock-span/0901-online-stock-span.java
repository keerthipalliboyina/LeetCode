class StockSpanner {
    Stack<Integer> span=new Stack<>();
    Stack<Integer> prices=new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int poppedCount=1;
        while(!prices.isEmpty() && prices.peek()<=price)
        {
            prices.pop();
            poppedCount+=span.pop();

        }
        prices.push(price);
        span.push(poppedCount);

        return poppedCount;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */