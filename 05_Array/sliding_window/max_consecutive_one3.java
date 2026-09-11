
public class max_consecutive_one3 {
    public static int consecutive(int[] arr, int k){
        int n=arr.length;
        int left=0;
        int zerocount=0;
        int maxlength=0;
        for(int right=0; right<n;right++){
            if(arr[right]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(arr[left]==0){
                    zerocount--;
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
    public static void main(String[] args){
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int result=consecutive(arr,k);
        System.out.print("max consecutives of ones: "+result);

    }
}
