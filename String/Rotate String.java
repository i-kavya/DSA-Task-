class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++)
        {
            if(s.equals(goal))
                return true;
            else
                s=shift(s);
        }
        if(s.equals(goal))
            return true;
        else
            return false;
    }
    public static String shift(String s)
    {
        s=s.substring(1,s.length())+s.charAt(0);
        return s;
    }
}