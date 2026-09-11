
public class max_consecutive_one {
    public static int consecutive(int[] arr){
        int current_count=0;
        int max_count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                current_count++;
                
            }
            else{
                max_count=Math.max(max_count,current_count);
                current_count=0;
            }
            
        }
        return Math.max(max_count,current_count);
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        int result=consecutive(arr);
        System.out.print("max consecutives one is: "+result);
    }
    
}
