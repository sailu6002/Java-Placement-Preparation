import java.util.Arrays;
// leetcode 283
public class move_zeros {
    public static void move(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
            
        }

    }
    public static void main(String[] args) {
        int[] arr={0,1,2,5,0,7,0,9};

        move(arr);
        System.out.println("all zeros to the end: "+Arrays.toString(arr));
        

    }
    
}
