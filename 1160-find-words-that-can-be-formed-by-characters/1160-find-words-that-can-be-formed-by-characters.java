class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int ans=0;
        for(String str : words){
            HashMap<Character,Integer> temp = new HashMap<>();
            boolean check = true;

            for(char ch : str.toCharArray()){
                temp.put(ch,temp.getOrDefault(ch,0)+1);

                if(temp.get(ch)>map.getOrDefault(ch,0)){
                    check = false;
                    break;
                }
            }

            if(check){
                ans += str.length();
            }

        }
        return ans;
    }
}