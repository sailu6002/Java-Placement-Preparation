import java.util.Arrays;

public class search2Darray {
    public static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int[][] arr={
            {2,3,4,5},
            {23,45,56,78,89},
            {29,60,12},
            {10,20,30,16}
        };
        int target=12;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
}
