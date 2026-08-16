public class left_rotated{
    public void leftrotated(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for(int num:arr){
            System.out.print(num+ " ");

        }
    }
    public static void main(String[] args) {
        left_rotated obj=new left_rotated();
        int[] arr={1,2,3,4,5};
        obj.leftrotated(arr);
    }
}