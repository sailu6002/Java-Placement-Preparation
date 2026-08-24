public class ceiling_number {
    public static int number(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low; // ceiling number
        // retun high; // floor number
       
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,12,14,16,17};
        int target=11;
        int result=number(arr, target);
        System.out.println("the ceiling element is : "+arr[result]);
    }
    
}
