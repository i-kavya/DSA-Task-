class Solution {
    public String reverseWords(String s) {
        String str1 = "";
        s = s.trim();
        int c = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch == ' ' && s.charAt(i + 1) == ' ') c++;
            else if (ch == ' ' && s.charAt(i + 1) != ' ') {
                str1 += ch;
                c = 0;
            } else if(ch!=' ') str1 += ch;
        }
        str1 += s.charAt(s.length() - 1);
        String ans = "";
        String temp = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            if (str1.charAt(i) == ' ' || i==0) {
                if(i==0) {
                    temp=str1.charAt(i)+temp;
                    break;
                }
                ans = ans + temp + ' ';
                temp = "";
            } else temp = str1.charAt(i) + temp;
        }
        ans=ans+temp;
        return ans;
    }
}