class Solution {
    public int[] twoSum(int[] num, int t) {
        Map<Integer,Integer> m=new HashMap<>();
        int n=0;
        for(int i=0;i<num.length;i++){
            if(m.containsKey(num[i])){
                return new int[]{m.get(num[i]),i};
            }
            m.put(t-num[i],i);
        }
        return new int[]{};
    }
}
