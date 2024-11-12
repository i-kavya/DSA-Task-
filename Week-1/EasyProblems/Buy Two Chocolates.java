class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int i=0;
        int j=1;
        int count=prices[i]+prices[j];
        if(count<=money)
        {
            return money-count;
        }
        else
        {
            return money;
        }
    }
}