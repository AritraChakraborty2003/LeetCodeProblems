class Solution {
    public boolean isPalindrome(String s) {
        String revString="";
        for(int i=0;i<s.length();i++){
            int val=(int)(s.charAt(i));
            if((val>=65 && val<=90) ||  (val>=97 &&           val<=122) || (val>=48 && val<=57)){
                revString+=String.valueOf(s.charAt(i));
            }
        }
        revString=revString.toLowerCase();
        int l=0;
        int h=revString.length()-1;
        while(l<h){
        if(revString.charAt(l)!=revString.charAt(h))
        {
            return false;
        }
        l++;h--;
        }
        return true;

           
    }
}