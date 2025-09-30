class Solution {
    public int earliestTime(int[][] tasks) {
        int earliest = Integer.MAX_VALUE;
        
        for (int i = 0; i < tasks.length; i++) {
            int finishTime = tasks[i][0] + tasks[i][1]; 
            earliest = Math.min(earliest, finishTime);
        }
        
        return earliest;
    }
}

