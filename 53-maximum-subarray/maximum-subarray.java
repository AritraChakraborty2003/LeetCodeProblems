class Solution {
    public int maxSubArray(int[] nums) {
        int max_subarray_sum=0;
        int max_till_here=0;
        int n=nums.length;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count++;
            }
        }
     
        if(count==n)
            {   

                int max_val=Integer.MIN_VALUE;
                for(int i=0;i<n;i++){
                    if(max_val<nums[i])
                        max_val=nums[i];
                }
              return max_val;
            }
        for(int i=0;i<nums.length;i++){
            max_till_here+=nums[i];
            if(max_till_here<0) 
                max_till_here=0;
            else if(max_till_here>max_subarray_sum)
                max_subarray_sum=max_till_here;
        }
        return max_subarray_sum;
    }
}