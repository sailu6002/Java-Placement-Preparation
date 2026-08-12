public class number_onetime {
    public int appearance(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int num=arr[i];
            int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]==num){
                count++;     
            }
        }
        if(count==1){
            return num;
        }  
    }
    return -1;
    } 
    public static void main(String[] args) {
        int[] arr={1,2,1,4,2,1,4,5,4};
        number_onetime obj=new number_onetime();
        int result=obj.appearance(arr);
        System.out.println(result);
    }
    
}
