class Solution {
    
    static int maxInArray(int a[],int n){
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max) max=a[i];
        }
        return max;
    }
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] prefixSum=new int[n];
        prefixSum[0]=gain[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+gain[i];
        }

        int maxOfPrefixSum=maxInArray(prefixSum,n);
        if(maxOfPrefixSum>0) return maxOfPrefixSum;
        return 0;

    }
}