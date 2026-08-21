class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int arr[][] = new int [intervals.length+1][2];

        for(int i=0;i<intervals.length;i++){
            arr[i] = intervals[i];
        }

        arr[intervals.length] = newInterval;

        Arrays.sort(arr , (a,b) -> a[0] - b[0]);

        int ind=0;
        for(int i=1;i<arr.length;i++){
            if(arr[ind][1] >= arr[i][0]){
                arr[ind][1] = Math.max(arr[ind][1],arr[i][1]);
            }

            else{
                ind++;
                arr[ind] = arr[i];
            }
        }

        return Arrays.copyOf(arr,ind+1);
    }
}