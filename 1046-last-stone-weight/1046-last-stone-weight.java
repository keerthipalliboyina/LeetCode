class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : stones) {
            pq.add(num);
        }

        while (pq.size() > 1) {
            int f = pq.poll();
            int s = pq.poll();

            if (f != s) {
                pq.add(f - s);
            }
        }

        if (pq.isEmpty()) {
            return 0;
        }

        return pq.peek();
    }
}