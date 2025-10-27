class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0)
        {
            int r=n%10;
            list.add(r);
            n=n/10;
        }
        int pro=1;
        int maxpro=0;
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                pro=list.get(i)*list.get(j);
                if(pro>maxpro)
                {
                    maxpro=pro;
                }
            }
        }
        return maxpro;
    }
}