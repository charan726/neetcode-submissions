class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s=new TreeSet<>();
        for(int i:nums){
            s.add(i);
        }
        // System.out.println(s.size() +" "+nums.length);
        return !(s.size() == nums.length);
    }
}