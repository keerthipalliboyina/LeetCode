class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int num:asteroids)
        {
            if(num>0)
            {
                stack.push(num);
            }
            else
            {
               int res=Math.abs(num);
               while(!stack.isEmpty() && stack.peek()>0)
               {
                  int val=stack.peek();
                  if(res>val)
                  {
                    stack.pop();
                  }
                  else if(res==val)
                  {
                    stack.pop();
                    num=0;
                    break;
                  }
                  else
                  {
                    num=0;
                    break;
                  }
               }
               if(num!=0)
               {
                stack.push(num);
               }
            }
        }
        int[] arr=new int[stack.size()];
       
        for(int i=stack.size()-1;i>=0;i--)
        {
            arr[i]=stack.pop();
           
        }
        return arr;
    }
}