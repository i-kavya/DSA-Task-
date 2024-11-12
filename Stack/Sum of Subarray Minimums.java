class Solution {
    public int sumSubarrayMins(int[] arr) {
        int s=0;
        int n=arr.length;
        int mini=arr[0];
        for(int i=0;i<n;i++)
        {
            mini=arr[i];
            for(int j=i;j<n;j++)
            {
                mini=Math.min(mini,arr[j]);
                s+=mini;
            }
            s=s%1000000007;
        }
        return s;
    }
}