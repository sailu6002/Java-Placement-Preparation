//gfg : Find position of an element in a sorted array of infinite numbers

public class position_infinite_number {
    public static int findrange(int[] arr, int target){
        int start=0;
        int end=1;
       while(arr[end]<target){
         int newstart=end+1;
         end=end+(end-start+1)*2;
         start=newstart;
       }
       return binarysearch(arr, start, end, target);
    }
    
    public static int binarysearch(int[] arr,int start, int end, int target){
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target=10;
        int result=findrange(arr, target);
        System.out.println(result);
    }
    
    
}
