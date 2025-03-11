import java.util.ArrayList; 
import java.util.List;
class Solution1{

    public static List<int[]> InsertIntervals(int[][]intervals , int[] newInterval){
        int i = 0 , n = intervals.length ; 
        List<int[]> result = new ArrayList<>(); 
        while(i<n && intervals[i][1]<newInterval[0]){
            result.add(intervals[i]);
            i++; 
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;

        }
        result.add(newInterval);
        while(i<n){
            result.add(intervals[i]);
            i++; 
        }
        return result ; 
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1(); 
        int[][] intervals = {{1,2},{3,4},{5,7},{8,10},{12,16}};
        int[] newInterval = {6,8};
        List<int[]> result = InsertIntervals(intervals,newInterval);
        for(int[] interval: result){
            System.out.print("["+interval[0]+","+interval[1]+"] ");
        }
    }
}