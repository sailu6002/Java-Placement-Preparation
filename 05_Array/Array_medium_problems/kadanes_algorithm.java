public class kadanes_algorithm {
    public static int maxsubarray(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            
            if(sum<0){
                sum=0;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        
        int[] nums={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result=maxsubarray(nums);
        System.err.println("the maximum subarray sum is: "+result);
    }
    
}
