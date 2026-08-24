class Solution {
    public String numberToWords(int num) {

        if (num == 0)
            return "Zero";

        String[] one = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] ten = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        String[] place = {
            "", "Thousand", "Million", "Billion"
        };

        StringBuilder ans = new StringBuilder();
        int group = 0;

        while(num>0){

            int part = num%1000;
            num /= 1000;
            if(part!=0){

                StringBuilder temp = new StringBuilder();

                //for hundred values
                if(part>=100){
                    temp.append(one[part/100]).append(" Hundred");
                    part %=100;

                    if(part>0){
                        temp.append(" ");
                    }
                }

                //for range 20-99 values
                if(part>=20){
                    temp.append(ten[part/10]);
                    part %= 10;

                    if(part>0) temp.append(" ");
                }

                //for range 1-19 values
                if(part>0){
                    temp.append(one[part]);
                }

                if(group>0){
                    temp.append(" ").append(place[group]);
                }

                if(ans.length()>1) temp.append(" ");

                ans.insert(0,temp);
            }
            group++;

            
        }
        return ans.toString();
    }
}