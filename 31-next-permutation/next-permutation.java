class Solution {
    public void nextPermutation(int[] nums) {
      int ind=-1;
      int n=nums.length;
      for(int i=n-2;i>=0;i--){
          if(nums[i]<nums[i+1])
          {
              ind=i;
              break;
          }
      }

    if(ind==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }
    else{
        for(int i=nums.length-1;i>=ind;i--){
            if(nums[i]>nums[ind])
            {
                swap(nums,i,ind);
                break;
            }
        }
        
        reverse(nums,ind+1,nums.length-1);

     }

    }

    static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void reverse(int[] a,int l,int h){
        while(l<h){
            swap(a,l,h);
            l++;h--;
        }
    }
    
}