class Solution {
    public int minimumOperations(int[] nums) {
        int[] freq=new int[101];
        int idx=-1;
        int cnt=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(freq[nums[i]]<1) freq[nums[i]]++;
            else
            {
                idx=i+1;
                break;
            }
        }
        if(idx%3==0) cnt=idx/3;
        else cnt=(idx+2)/3;
        return cnt;
    }
}