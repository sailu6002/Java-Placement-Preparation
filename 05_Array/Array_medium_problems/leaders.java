/*
1. A leader is an element that is greater than or equal to all the elements to its right.
2. The last element is always a leader because there are no elements to its right.
3.If the current element is greater than or equal to the current maximum, it is a leader.
4.Update the maximum.
5. Since leaders are found from right to left, reverse the result at the end. */



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