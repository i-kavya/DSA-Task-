class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] sumLeft=new int[n+1];
        int[] sumRight=new int[n+1];
        for(int i=0;i<n;i++){
            sumLeft[i+1]=sumLeft[i]+nums[i];
        }
        for(int i=n-1;i>=0;i--){
            sumRight[i]=sumRight[i+1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(sumLeft[i]==sumRight[i+1]){
                return i;
            }
        }
        return -1;
    }
}