class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0) return 0;
        int minPri =Integer.MAX_VALUE, maxPro = 0;
        for(int i=0;i<n;i++){
            if(prices[i]<minPri){
                minPri = prices[i];
            }
            else{
                maxPro = Math.max(maxPro, prices[i]-minPri);
            }

        }
        return maxPro;
    }
}