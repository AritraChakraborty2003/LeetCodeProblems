class Solution {
    int sumOfArray(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int prefixSum=0;
        int sumOfArray=sumOfArray(nums,n);
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            int lSum=prefixSum-nums[i];
            int rSum=sumOfArray-lSum-nums[i];

           
            if(lSum==rSum) return i;
        }
        return -1;
    }
}