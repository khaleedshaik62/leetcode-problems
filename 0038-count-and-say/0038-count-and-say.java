class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for (int i = 1; i < n; i++) {

            StringBuilder ans = new StringBuilder();

            int start = 0;

            for (int j = 1; j <= s.length(); j++) {

                if (j == s.length() || s.charAt(j) != s.charAt(start)) {

                    ans.append(j - start);
                    ans.append(s.charAt(start));

                    start = j;
                }
            }

            s = ans.toString();
        }

        return s;
    }
}