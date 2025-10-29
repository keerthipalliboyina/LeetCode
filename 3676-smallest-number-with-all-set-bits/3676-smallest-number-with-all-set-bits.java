class Solution {
    public int smallestNumber(int n) {
      int i = n;
    while (true) {
    String binary = Integer.toBinaryString(i);
    boolean allones = true;

    for (int j = 0; j < binary.length(); j++) {
        if (binary.charAt(j) != '1') {
            allones = false;
            break;
        }
    }

    if (allones) {
        return i;
    }

    i++; 
}

    }
}