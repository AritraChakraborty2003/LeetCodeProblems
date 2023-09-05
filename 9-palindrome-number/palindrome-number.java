class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int cpy=x; int res=0;
        while(cpy!=0){
            int rem=cpy%10;
            res=res*10+rem;
            cpy/=10;
        }

        if(res==x) return true;
        return false;
    }   
}