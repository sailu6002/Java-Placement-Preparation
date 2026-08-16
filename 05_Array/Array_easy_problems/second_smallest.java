public class second_smallest {
    public static int smallest(int[] arr,int n){
        if(n<2){
            return -1;
        }
        int first=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<first){
                second_small=first;
                first=arr[i];
            }
            else if(arr[i]<second_small && arr[i]!=first){
                second_small=arr[i];
            }
        }
        return second_small;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,44,55,66,12};
        int n=arr.length;
        int result=smallest(arr, n);
        System.out.println(result);
    }
    
}
