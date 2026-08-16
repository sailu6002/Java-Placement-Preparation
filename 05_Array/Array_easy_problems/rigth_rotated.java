public class rigth_rotated {
    public void rightrotated(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int num:arr){
            System.out.print(num +" ");
        }
    }
    public static void main(String[] args) {
        rigth_rotated obj=new rigth_rotated();
        int[] arr={1,2,3,4,5};
        obj.rightrotated(arr);
    }
    
}
