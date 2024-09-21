class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int temp=x;
        int rev=0;
        while(temp!=0){
            int rem=(int)(temp%10);
            rev = rev*10+rem;
            temp=temp/10;
        }
        if(x==rev){
            return true;
            }
        else{
            return false;
        }


    }
}