public class check_sorted {
    public boolean issorted(int[] arr,int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,5,6};
        int n=arr.length;
        check_sorted obj=new check_sorted();
        boolean result=obj.issorted(arr,n);
        if(result){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }

    }
    
}
