class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,ele=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(cnt==0)
                {
                    ele=nums[i];
                    cnt=1;
                }
            else if(nums[i]==ele)
            {
                cnt++;
            }
            else{
                cnt--;
            }
        }

        cnt=0;

        for(int i=0;i<n;i++){
            if(nums[i]==ele)
            {
                cnt++;
            }
        }

        if(cnt>(int)Math.floor(n/2)) return ele;
        else return -1;

    }
}