class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int res=0;
        for(int i:nums){
            if(i==1) cnt++;
            else cnt=0;
            res=Math.max(cnt,res);
        }
        return res;
    }
}