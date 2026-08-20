public class Linear_search{
    //return the index if target is found
    public static int search(int[] arr,int k){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;

    }
    // return true target is found
    public static boolean search1(int[] arr,int k){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int k=30;
        int result=search(arr,k);
        System.out.println(result);
        boolean result2=search1(arr, k);
        System.out.println(result2);

    }
    
}
