public class zeors_last {
    public void zeroslast(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                 j++;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args){
        zeors_last obj=new zeors_last();
        int[] arr={1,0,3,0,2,4};
        obj.zeroslast(arr);
    }
    
}
