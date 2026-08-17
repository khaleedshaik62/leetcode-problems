class Solution {
    public int percentageLetter(String s, char letter) {
        if(s.length()==0) return 0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == letter)
                c++;
        }
        return (c*100)/s.length();
    }
}