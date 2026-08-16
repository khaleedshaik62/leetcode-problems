class Solution {
    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) return false;

        int a = -1, b = -1;
        boolean[] seen = new boolean[26];
        boolean duplicate = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {
                if (a == -1) a = i;
                else if (b == -1) b = i;
                else return false;
            }

            int x = s.charAt(i) - 'a';
            if (seen[x]) duplicate = true;
            seen[x] = true;
        }

        if (a == -1)
            return duplicate;

        return b != -1 &&
               s.charAt(a) == goal.charAt(b) &&
               s.charAt(b) == goal.charAt(a);
    }
}