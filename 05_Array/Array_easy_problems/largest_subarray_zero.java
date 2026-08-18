public class largest_subarray_zero {
    public static int subarray(int[] nums){
        int n=nums.length;
        int maxLen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==0){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums={15, -2, 2, -8, 1, 7, 10, 23};
        int result=subarray(nums);
        System.err.println("largest subarray with the given k : "+result);

    }
    
}
