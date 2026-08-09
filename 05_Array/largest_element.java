public class largest_element {
    public static int largest(int[] arr,int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,6,8,7,9,0};
        int n=arr.length;
        int result=largest(arr,n);
        System.out.println(result);
    }
    
    
}
