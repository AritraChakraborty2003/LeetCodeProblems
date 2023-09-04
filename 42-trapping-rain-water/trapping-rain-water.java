class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int[] lMax=new int[n];
        int[] rMax=new int[n];
        lMax[0]=height[0];
        int maxWater=0;
        for(int i=1;i<n;i++){
            lMax[i]=Math.max(height[i],lMax[i-1]);
        }
        rMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rMax[i]=Math.max(height[i],rMax[i+1]);
        }

     for(int i=0;i<n;i++){
        maxWater+=Math.min(rMax[i],lMax[i])-height[i];
      }

      return maxWater;
    
    }
}