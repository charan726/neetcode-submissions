class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length);
    }
    public int[] mergeSort(int[] arr,int l,int r){
        if(l == r-1){
            return arr;
        }
        int m = (l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m,r);
        merge(arr,l,m,r);
        return arr;
    }
    public void merge(int[] arr,int l,int m,int r){
        int i=l,j=m;
        int[] tem=new int[r-l];
        int c=0;
        while(c<r-l){
            if(i>=m){
                tem[c++]=arr[j++];
                continue;
            }
            if(j>=r){
                tem[c++]=arr[i++];
                continue;
            }
            if( arr[i] < arr[j] ){
                tem[c++]=arr[i++];
            }
            else{
                tem[c++]=arr[j++];
            }
        }
        for(int k=l;k<r;k++){
            arr[k]=tem[k-l];
        }
    }
    
}