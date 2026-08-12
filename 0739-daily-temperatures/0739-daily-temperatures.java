class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int left=0;
        int n=temperatures.length;
        int[] res=new int[n];
        while(left<n)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[left])
    
            {
                int val=stack.pop();
                res[val]=left-val;

            }
            stack.push(left);
            left++;
        }
        return res;
    }
}