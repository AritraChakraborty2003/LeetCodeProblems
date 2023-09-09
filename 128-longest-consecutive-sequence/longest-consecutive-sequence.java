class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hSet=new HashSet<Integer>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int it:nums){
            hSet.add(it);
        }
        for(int it:hSet){
            a.add(it);
        }
        Collections.sort(a);
        if(a.size()==0) return 0;
        int maxLen=1; int cnt=1;
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i+1)-a.get(i)==1)
            {
                cnt++;
                maxLen=Math.max(maxLen,cnt);
            }
            else{
                cnt=1;
            }
        }
        return maxLen;
    }
}