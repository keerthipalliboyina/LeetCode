class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
       
        for(char ch:s.toCharArray())
        {
           
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.size()>=1)
                {
                    if(stack.peek()=='{'  && ch=='}')
                    {
                        stack.pop();
                    }
                    else if(stack.peek()=='[' && ch == ']')
                    {
                        stack.pop();
                    }
                    else if(stack.peek()=='('  && ch ==')')
                    {
                        stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                    
                }
                else
                {
                    return false;
                }
            }
            
        }
        if(!stack.isEmpty()){
                return false;
        }
        return true;
    }
}