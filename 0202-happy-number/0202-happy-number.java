class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n==4 || n==6  || n==8 ) return false;
        while(n >= 5)
        {
            int sum = 0;
            while(n>0)
            {
                int temp = n%10;
                sum += temp*temp;
                n/=10;
            }
            n = sum;
        }
        return (n==1) ? true : false;
    }
}