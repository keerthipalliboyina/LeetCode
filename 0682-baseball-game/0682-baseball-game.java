class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> s=new Stack();
        for(String ch:operations)
        {
            if(ch.equals("C"))
            {
                s.pop();
            }
            else if(ch.equals("D"))
            {
                int first=s.peek();
                int sum=first+first;
                s.push(sum);
            }
            else if(ch.equals("+"))
            {
                int first=s.pop();
                int second=s.peek();
                s.push(first);
                int sum=first+second;
                s.push(sum);
            }
            else
            {
                s.push(Integer.parseInt(ch));
            }
        }
        int sum=0;
        while(!s.isEmpty())
        {
            sum+=s.pop();
        }
        return sum;
    }
}