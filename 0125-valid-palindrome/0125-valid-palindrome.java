class Solution {
    public boolean isPalindrome(String s) {
        char [] ch = s.toCharArray();
        int i =0;
        int j = ch.length-1;
        while(i<j){
            if(Character.isLetterOrDigit(ch[i])  && Character.isLetterOrDigit(ch[j])){
            if(Character.toLowerCase(ch[i]) != Character.toLowerCase(ch[j])){
                return false;
            }
            i++;
            j--;
            }
            else if(Character.isLetterOrDigit(ch[i])){
                j--;
            }
            else if(Character.isLetterOrDigit(ch[j])){
                i++;
            }
            else{
                i++;
                j--;
                
            }
        }
        return true;
        
    }
}