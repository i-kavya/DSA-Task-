class Solution {
    public String removeOuterParentheses(String s) {
        String str="";
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' && f++ > 0)
                str+=ch;
            else if(ch==')' && f-- > 1)
                str+=ch;
        }
        return str;
    }
}