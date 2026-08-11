import java.util.HashSet;

public class Hashing_search {
    public static boolean search(int[] arr,int target){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.contains(target);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int target=40;
        System.out.println(search(arr, target));
    }
    
}
