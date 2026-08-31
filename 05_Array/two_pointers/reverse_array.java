import java.util.Arrays;

public class reverse_array{
    public static void reversearr(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        reversearr(arr);
        System.out.println("reverse an array: "+ Arrays.toString(arr));
    }
}