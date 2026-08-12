public class count_maxones {
    public int maxcount(int[] arr){
        int count=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxi=Math.max(maxi, count);
        }
        
        return maxi;

    }
    public static void main(String[] args){
        int[] arr={1,1,0,1,0,1,1};
        count_maxones obj=new count_maxones();
        int result=obj.maxcount(arr);
        System.out.print(result);

    }
    
    
}
