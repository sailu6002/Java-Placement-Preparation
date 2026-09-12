// it will run when the array having no duplicates values 

public class max_subarray{

    public static int subarray(int[] arr,int k){
        int sum=0;
        int n=arr.length;
        int max_sub=0;
        for(int i=0;i<k;i++){
            
            sum+=arr[i];
        }
        max_sub=sum;
        int ans=0;
        for(int j=k;j<n;j++){
            if(arr[j]==arr[j-1]){
               j++;
            }
            else{
                sum=sum-arr[j-k]+arr[j];
            }
            
        }
        return Math.max(max_sub,sum);
       
    }
    public static void main(String[] args){
        int[] arr={1,5,4,2,9,9,9};
        int k=3;
        int result=subarray(arr, k);
        System.out.print(result);
    }

}
    

