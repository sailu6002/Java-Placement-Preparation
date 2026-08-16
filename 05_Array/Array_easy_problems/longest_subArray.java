public class longest_subArray{
    public static int longest(int[] arr,int k){
        int left=0;
        int right=0;
        int maxlen=0;
        int sum=arr[0];
        while(right<arr.length){
            while(left<=right && sum>k){
                sum=sum-arr[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<arr.length){
                sum=sum+arr[right];
            }

        }
        return maxlen;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int k=15;
        int ans=longest(arr, k);
        System.err.println("length of longest sunarray is: "+ans);
    }
}