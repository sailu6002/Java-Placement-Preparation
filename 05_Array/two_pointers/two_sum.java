public class two_sum {
    public static int[] two(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={3,5,7,8,10,12};
        int target=18;
        int[] result=two(arr, target);
        System.out.print("the targetd sum of index is: ");
        for(int num:result){
           System.out.print(num+" ");

        }
        


    }
    
}
