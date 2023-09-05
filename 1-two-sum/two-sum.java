class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hMap=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
             if(hMap.containsKey(target-nums[i]))
             {
                 
                 res[0]=i;
                 res[1]=hMap.get(target-nums[i]);
             }
        
             else
                hMap.put(nums[i],i);
        }
        return res;
    }
}