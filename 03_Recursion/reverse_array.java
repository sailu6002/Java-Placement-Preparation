public class reverse_array {
    public int[] reverse(int[] arr){
        int n=arr.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[n-1-i];
        }
        return ans;
    }
    public static void main(String[] args) {
        reverse_array obj=new reverse_array();
        int[] arr={1,2,3,4,5};
        int[] result=obj.reverse(arr);
        System.out.println("reverse array: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");

        }
        System.out.println();
    }
    
}
