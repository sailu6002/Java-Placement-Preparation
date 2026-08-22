

public class order_agnostic {
    public static int order(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsen=arr[start]<arr[end];
        while(start<end){
            int mid=start+(end-start)/2;
            while(arr[mid]==target){
                return mid;
            }
            if(isAsen){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

            }
            return -1;
        }
        
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50, 40, 30};

        int target = 60;

        int result = order(arr, target);

        System.out.println("the array of index: "+result);

        
    }
    
}
