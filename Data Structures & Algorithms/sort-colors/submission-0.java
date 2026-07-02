class Solution {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        for(int i:nums){
            switch(i){
                case 0:
                    r++;
                    break;
                case 1:
                    w++;
                    break;
                default:
                    b++;
                    break;
            }
        }
        int i=0;
        while(i<nums.length){
            if(r>0){
                nums[i++]=0;
                r--;
            }
            else if(w>0){
                nums[i++]=1;
                w--;
            }
            else{
                nums[i++]=2;
            }
        }
    }
}