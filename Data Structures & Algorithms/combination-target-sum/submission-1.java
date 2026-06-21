class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] nums, int t) {
        ans=new ArrayList<>();
        fun(nums,t,0,new ArrayList<>(),0);
        return ans;
    }
    public void fun(int[] nums, int t,int ind,List<Integer> tem,int sum){
        if(sum == t){
            ans.add(new ArrayList<>(tem));
            return;
        }
        if(sum>t ) return;
        if(ind<nums.length){
            tem.add(nums[ind]);
            fun(nums,t,ind,tem,sum+nums[ind]);
            tem.remove(tem.size()-1);
            fun(nums,t,ind+1,tem,sum);  
        }
    }
}