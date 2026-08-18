class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> li = new ArrayList<>();

        if(n==0) return li;
        li.add(new ArrayList<>(Arrays.asList(1)));

        for(int i=1;i<n;i++){
            List<Integer> li2 = new ArrayList<>();
            
            li2.add(1);
            
            for(int j=1;j<i;j++){
                li2.add(li.get(i-1).get(j-1)+li.get(i-1).get(j));
            }

            li2.add(1);
            li.add(li2);
        }

        return li;
    }
}