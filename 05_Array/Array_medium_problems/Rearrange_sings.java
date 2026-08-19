public class Rearrange_sings{
    public static int[] rearrangeelements(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];// initialize the arry to store the rearranging elemnts
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,2,-1,-5,9,-3};
        int[] result=rearrangeelements(arr);
        System.out.print("rearranging the elements by signs: ");
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}