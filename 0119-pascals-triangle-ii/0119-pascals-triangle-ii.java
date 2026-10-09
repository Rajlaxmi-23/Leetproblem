

import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long res = 1;

        for (int c = 0; c <= rowIndex; c++) {
            ans.add((int) res);
            res = res * (rowIndex - c) / (c + 1);
        }

        return ans;
    }
}