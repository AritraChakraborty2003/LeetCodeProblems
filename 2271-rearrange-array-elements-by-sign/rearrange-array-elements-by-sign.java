class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> negArr=new ArrayList<>();
        ArrayList<Integer> posArr=new ArrayList<>();
        for(int it:nums){
            if(it>0)
                posArr.add(it);
            else
                negArr.add(it);
        }
        int pInd=0; int nInd=0;
        for(int i=1;i<nums.length;i+=2){
            nums[i-1]=posArr.get(pInd++);
            nums[i]=negArr.get(nInd++);
        }
        return nums;
    }
}