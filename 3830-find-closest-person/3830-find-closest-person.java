class Solution {
    public int findClosest(int x, int y, int z) {
        // Calculate distances
        int dist1 = Math.abs(x - z);
        int dist2 = Math.abs(y - z);

        if (dist1 < dist2) {
            return 1;  // Person 1 reaches first
        } else if (dist2 < dist1) {
            return 2;  // Person 2 reaches first
        } else {
            return 0;  // Both reach at the same time
        }
    }
}
