class Solution {
    public static boolean isvol(char c){
        String str = "aeiouAEIOU";
        return str.contains(""+ c);
    }
    public String reverseVowels(String s) {
        char [] ch = s.toCharArray();
        int i=0;
        int j=ch.length-1;
                while(i<j){
                    if(isvol(ch[i])  && isvol(ch[j])){
                        char temp = ch[i];
                        ch[i]=ch[j];
                        ch[j]=temp;
                        i++;
                        j--;
                    }
                    else if(isvol(ch[j])){
                        i++;

                    }
                    else if(isvol(ch[i])){
                        j--;

                    }
                    else{
                        i++;
                        j--;
                    }
                }
                return new String(ch);

        
    }
}