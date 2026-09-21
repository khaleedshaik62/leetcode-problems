class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int num : nums2){

            while(!st.isEmpty() && st.peek() <num){
                map.put(st.pop(),num);
            }

            st.push(num);
        }

        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }

        int[] ans = new int[nums1.length];
        int i=0;

        for(int num : nums1){
            ans[i++] = map.get(num);
        }

        return ans;
    }
}