class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        fun(nums,0,new ArrayList<>());
        return ans;
    }
    public void fun(int[] nums,int ind,List<Integer> tem){
        ans.add(new ArrayList<>(tem));
        for(int i=ind;i<nums.length;i++){
            System.out.println(i+" " +tem);
            tem.add(nums[i]);
            fun(nums,i+1,tem);
            tem.remove(tem.size()-1);
        }
    }
}
