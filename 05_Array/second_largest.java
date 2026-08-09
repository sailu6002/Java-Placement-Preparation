public class second_largest{
    public static int secondlargest(int[] arr,int n){
        if(n<2){
            return -1;
        }
        int first=Integer.MIN_VALUE;
        int second_lar=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>first){
                second_lar=first;
                first=arr[i];
            }
            else if(arr[i]<second_lar && arr[i]!=first){
                second_lar=arr[i];
            }
        }
        return second_lar;
    }
    public static void main(String[] args){
        int[] arr={11,22,55,66,44,77};
        int n=arr.length;
        int result=secondlargest(arr,n);
        System.out.println(result);

    }
    
}
