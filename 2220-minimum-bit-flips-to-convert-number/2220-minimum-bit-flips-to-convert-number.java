class Solution {
    public int minBitFlips(int start, int goal) {
        int res = start ^ goal;
        String str = Integer.toBinaryString(res);
        int c=0;
        for(char ch : str.toCharArray()){
            if(ch=='1') c++;
        }
        return c;
    }
}