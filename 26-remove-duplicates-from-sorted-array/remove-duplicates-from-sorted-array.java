class Solution {
    public int removeDuplicates(int[] nums) {
    LinkedHashSet<Integer> hSet=new                 LinkedHashSet<Integer>();
        for(int it:nums)
            hSet.add(it);
        
        ArrayList<Integer> arr=new ArrayList(hSet);
        for(int i=0;i<hSet.size();i++){
            nums[i]=arr.get(i);
        }
        return hSet.size();
    }
}