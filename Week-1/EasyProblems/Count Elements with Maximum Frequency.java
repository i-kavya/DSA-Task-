class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int k:nums)
            map.put(k,0);
        for(int k:nums)
        {
            int f=map.get(k);
            map.put(k,++f);
        }
        int m=1;
        for(int k:map.keySet()){
            m=Math.max(map.get(k),m);
        }
        int cnt=0;
        for(int k:map.keySet()){
            if(m==map.get(k))
                cnt++;
        }
        return cnt*m;
    }
}