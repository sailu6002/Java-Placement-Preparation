import java.util.Arrays;

public class remove_duplicates {
    public int remove(int[] arr,int n){
        if(n==0){
            return 0;
        }
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,3,0,2,1,3,4,5};
        int n=arr.length;
        remove_duplicates obj=new remove_duplicates();
        int ans=obj.remove(arr, n);
        System.out.println("unique elements count : "+ans);
        System.out.println("unique elements are: ");
        for(int k=0;k<ans;k++){
            System.out.print(arr[k]+ " ");

        }
        
    }
    
}
