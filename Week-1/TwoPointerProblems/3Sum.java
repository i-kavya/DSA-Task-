class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            
                int j=i+1;
                int k=n-1;
                while(j<k)
                {
                    int s=nums[i]+nums[j]+nums[k];
                    if(s==0)
                    {
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        l1.add(temp);
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1])
                            j++;
                        while(j<k && nums[k]==nums[k+1])
                            k--;
                    }
                    else if(s>0)
                        k--;
                    else if(s<0)
                        j++;
                }
        }
        return l1;
    }
}