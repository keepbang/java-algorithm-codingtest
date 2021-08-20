import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        
               
        if(intervals.length < 2){
            return intervals;
        }
        
        Arrays.sort(intervals,(o1, o2) -> Integer.compare(o1[0],o2[0]));
        
        List<int[]> arrList = new ArrayList<>();
        
        int size = intervals.length;
        int[] temp = intervals[0];
        
        for(int i = 1; i < size ; i++){
            if(temp[1] < intervals[i][0]){
                arrList.add(temp);
                temp = intervals[i];
            }else{
                temp[0] = Math.min(temp[0],intervals[i][0]);
                temp[1] = Math.max(temp[1],intervals[i][1]);
            }
        }
        
        arrList.add(temp);
        
        return arrList.toArray(new int[arrList.size()][]);
    }
}
