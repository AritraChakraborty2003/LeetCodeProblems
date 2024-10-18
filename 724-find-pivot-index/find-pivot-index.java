class Solution {
    static int arraySumFunction(int[] arr){
        int sum=0;
        for(int i:arr)
            sum+=i;
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int sumOfArray=arraySumFunction(nums);
        int sizeOfArray=nums.length;
        int prefixSum=0;
        for(int i=0;i<sizeOfArray;i++){
            prefixSum=prefixSum+nums[i];

            int lSum=prefixSum-nums[i];
            int rSum=sumOfArray-lSum-nums[i];

            if(lSum==rSum) return i;
        }

        return -1;
    }

}