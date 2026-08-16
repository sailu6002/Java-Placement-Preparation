import java.util.*;
public class union_twoArrays {
    public List<Integer> union(int[] arr1,int[] arr2){
        Set<Integer> st=new TreeSet<>();
        for(int num:arr1){
            st.add(num);
        }
        for(int num:arr2){
            st.add(num);
        }
        return new ArrayList<>(st);

    }
    public static void main(String[] args) {
      int[] arr1={1,2,3,4,5,6,7,3,2};
      int[] arr2={1,4,7,8,9,10,11,4,5,6};
      union_twoArrays obj=new union_twoArrays();
      List<Integer> result=obj.union(arr1, arr2);
      System.out.println("union of arr1 and arr2 is: ");
      for(int val:result){
        System.out.print(val+" ");
      }
    }
    
}
