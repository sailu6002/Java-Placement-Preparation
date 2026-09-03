//letcode 75
public class sort_Colors{
    public static void color(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[high];
                arr[high]=arr[low];
                arr[low]=temp;
                low++;
                mid++;

            }
            if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={2,0,1,0,1,2};
        color(arr);
        System.out.print("the sorted colrs is: ");
        for(int num:arr){
            System.out.print(num+" ");
        }



    }
}