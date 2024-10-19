class Solution {
    public boolean isPalindrome(int x) {
        int copyValue=x;
        int palindromeValue=0;
        while(x>0){
            int rem=x%10;
            palindromeValue=palindromeValue*10+rem;
            x=x/10;
        }

        if(palindromeValue==copyValue) return true;

        return false;
    }
}