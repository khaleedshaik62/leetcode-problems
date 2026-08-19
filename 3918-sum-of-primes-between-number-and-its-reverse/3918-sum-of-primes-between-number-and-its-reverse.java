class Solution {
    public int sumOfPrimesInRange(int n) {
        
        int temp=n,rev=0;
        while(temp>0){
            rev = rev*10+temp%10;
            temp /= 10;
        }

        boolean isPrime[] = new boolean[1001];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        
        for(int i=2;i*i<=1000;i++){
            for(int j=i*i;j<=1000;j +=i){
                isPrime[j]=false;
            }
        }

        int st = Math.min(n,rev);
        int end = Math.max(n,rev);
        int sum = 0;
        for(int i=st;i<=end;i++){
            if(isPrime[i]){
                sum += i;
            }
        }

        return sum;

    }
}