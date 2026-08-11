public class Binary_search {
    public static int search(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(mid<=right){
                left=mid+1;
            }
            if(mid>=left){
                right=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,44,65,76};
        int target=65;
        //int result=search(arr, target);
        System.out.println(search(arr, target));
    }
    
}
