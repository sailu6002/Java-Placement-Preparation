public class zeros_last {
    public void zeroslast(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return ;
        }
        for(int i=1;i<arr.length;i++){
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
        zeros_last obj=new zeros_last();
        int[] arr={1,0,3,0,2,4};
        obj.zeroslast(arr);
    }
    
}
