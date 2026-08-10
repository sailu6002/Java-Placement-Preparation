public class ones_right {
    public void onesright(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
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
        ones_right obj=new ones_right();
        int[] arr={1,2,3,4,2,1,2,1,2};
        obj.onesright(arr);
    }
    
}
