/*
https://leetcode.com/problems/pascals-triangle/
 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1; i<=numRows;i++){
            if(i==1)
                list.add(List.of(1));
            else if(i == 2)
                list.add(List.of(1,1));
            else{
                int idx = 0, prevRowIdx = 0;
                List<Integer> subList = new ArrayList<>();

                while(idx < i){
                    if(idx == 0 || idx == i-1)
                        subList.add(1);
                    else{
                        subList.add(list.get(i-2).get(prevRowIdx) + list.get(i-2).get(prevRowIdx+1));
                        prevRowIdx++;
                    }
                    idx++;
                }

                list.add(subList);
            }
        }

        return list;
    }
}
