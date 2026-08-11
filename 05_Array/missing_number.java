public class missing_number {
    public static int missing(int[] arr,int n){
        for(int i=1;i<n;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,7,8};
        int n=8;
        int result=missing(arr, n);
        System.out.println(result);
        
        
    }
    
}
