class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int ct=0,n=strs.length;
        for(int i=0;i>=0;i++){
            if(i>=strs[0].length()){
                return ans;
            }
            char c=strs[0].charAt(i);
            for(int j=1;j<n;j++){
                if(i>=strs[j].length()){
                    return ans;
                }
                if(strs[j].charAt(i) != c){
                    return ans;
                }
            }
            ans = ans+c; 
        }
        return ans;
    }
}