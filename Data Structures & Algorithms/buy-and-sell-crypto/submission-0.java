class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int max=0;
        int min=10^99;
        while (i<prices.length){
            if((prices[i]-min)>0){
                if(prices[i]-min>max){
                max=prices[i]-min;}
            }
            else{
                min=prices[i];
            }
            i++;
        }
        return max;
    }
}
