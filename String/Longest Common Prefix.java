class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==1)
            return strs[0];
        int min=strs[0].length();
        for (int i = 1; i < strs.length; i++)
        {
            if(strs[i].length()<min)
                min=strs[i].length();
        }
        int x=0;
        int f=0;
        String ans="",t="",temp="";
        for (int i = 1; i <= min; i++)
        {
            ans=t;
            while (x<strs.length-1)
            {
                if(strs[x].substring(0,i).equals(strs[x+1].substring(0,i)))
                    t=strs[x].substring(0,i);
                else
                {
                    f=1;
                    break;
                }
                x++;
            }
            if(f==1)
                break;
            x=0;
            temp=t;
        }
        if(min==1 && t==temp)
            return t;
        else if(t==temp)
            return t;
        return ans;
    }
}