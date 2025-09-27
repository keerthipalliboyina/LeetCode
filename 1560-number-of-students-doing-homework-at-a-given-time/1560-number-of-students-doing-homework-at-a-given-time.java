class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int s=startTime.length;
        int count=0;
        for(int i=0;i<s;i++)
        if(queryTime>= startTime[i] && queryTime<=endTime[i])
        {
            count++;    
        }
        return count;
        }
}