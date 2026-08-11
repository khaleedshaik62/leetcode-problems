class Solution {
    public int addDigits(int num) {
        
        if(num<10) return num;
        while(num>=10){
            int t=num;
            int sum=0;
            while(t>0){
                int rem=t%10;
                sum += rem;
                t /= 10;
            }
            num=sum;
            
        }
        return num;
    }
}