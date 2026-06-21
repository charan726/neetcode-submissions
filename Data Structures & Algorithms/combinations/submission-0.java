class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans=new ArrayList<>();
        fun( n, k,new ArrayList<>());
        return ans;
    }
    public void fun(int n, int k,List<Integer> tem){
        if(tem.size() == k){
            ans.add(new ArrayList<>(tem));
            return;
        }
        if(n<=0) return;

        for(int i=n;i>0;i--){
            tem.add(i);
            fun(i-1,k,tem);
            tem.remove(tem.size()-1);
        }
    }
}