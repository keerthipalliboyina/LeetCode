class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> list=new ArrayList<>();
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
           int greter=-1;
           boolean found=false;
           int current=nums1[i];
           for(int j=0;j<n2;j++)
           {
            if(nums2[j]==current)
            {
                 found=true;
            }
            else if(found && nums2[j]>current)
            {
                greter=nums2[j];
                break;
            }
           }
           res[i]=greter;
        }
        return res;
        
    }
}