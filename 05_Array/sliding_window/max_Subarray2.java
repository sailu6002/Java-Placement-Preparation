
import java.util.*;
public class max_Subarray2 {
    public static int subarray(int[] arr,int k){
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=arr.length;
        int maxsum=0;
        int sum=0;
        int left=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            map.put(arr[right],map.getOrDefault(arr[right], 0)+1);
            if(right-left+1>k){
                int leftelement=arr[left];
                sum-=leftelement; 
                map.put(leftelement,map.get(leftelement)-1);// leftelement repeated count is 1 so 1-1=0
                if(map.get(leftelement)==0){
                    map.remove(leftelement);
                }
                left++;

            }
            if(right-left+1==k && map.size()==k){  // it ewill store only unique values
                maxsum=Math.max(maxsum,sum);

            }


        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr={1,5,4,2,9,9,9};
        int k=3;
        int result=subarray(arr, k);
        System.out.println("maximum subarray is: "+result);
    }
    
}
