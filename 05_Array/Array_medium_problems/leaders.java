import java.util.*;
public class leaders{
    public static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args){
        int[] arr={16,17,4,3,5,2};
        System.err.println(leader(arr));
    }
}