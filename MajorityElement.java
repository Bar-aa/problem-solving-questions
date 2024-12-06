import java.util.HashMap;

public class Solution {
    public int majorityElement(final int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int majority = A.length / 2;

        for (int num : A) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
            if (hm.get(num) > majority) {
                return num;
            }
        }
         return -1; 
    }
}

